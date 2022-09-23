package creditCardValidation;


import java.util.InputMismatchException;
import static creditCardValidation.Card.*;

public class CreditCardValidation {
    private Long digits;
    private String num;


    public Long getDigits() {
        return digits;
    }
    public String getNum() {
        return num;
    }
    public int numLength() {

        return num.length();
    }
    public void setDigits(Long digits) {
        num = String.valueOf(digits);
        boolean isValid = (num.length() >= 13 && num.length() <= 16) && isValid();
        if (isValid) this.digits = digits;
       else {
            throw new InputMismatchException("Not within range");
        }
    }

        public Long sumEvenDigits () {
            char value;
            Long sum = 0L;
            for (int i = num.length() - 2; i >= 0; i -= 2) {
                value = num.charAt(i);
                Long multiply =  getAddedDigits((Long.decode(String.valueOf(value)) * 2));
                sum += multiply;
            }
            return sum;
        }
        private Long getAddedDigits(Long digits) {
        if(digits < 9){
            return digits;
        }
        return digits / 10 + digits % 10;
        }
        public Long sumOddDigits(){
            long sum =0L;
            for (int i = num.length() -1; i >0; i-=2) {
                sum += Long.parseLong(num.charAt(i) + "");
            }
            return sum;
        }
    public int totalSum() {
       return (int)(sumOddDigits() + sumEvenDigits());
    }
    public boolean isValid(){
        return totalSum() % 10 == 0;
    }
    public Card getCardType(){
        String cardType = String.valueOf(digits);
        int firstNumber = Integer.parseInt(String.valueOf(cardType.charAt(0)));
        int secondNumber = Integer.parseInt(String.valueOf(cardType.charAt(1)));

        if(firstNumber  == 4) return VISA;
        else if(firstNumber == 5) return MASTER;
        else if(firstNumber == 6) return DISCOVERY;
        else if(firstNumber == 3 && secondNumber == 7) return AMERICAN;
       throw new IllegalCardException("INVALID CARD");
    }
}

