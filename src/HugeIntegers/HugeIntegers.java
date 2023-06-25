package HugeIntegers;

import Deitel.chapter_7.Array;

import java.util.Arrays;

public class HugeIntegers {

  private final int[] digit = new int[40];
  private final int [] solution = new int[40];

    public int[] getSolution() {
        return solution;
    }

    public HugeIntegers(String input) {
   validate(input);
    parse(input);

    }
    public void validate(String input){
        if (input.length() > digit.length)throw new HugeIntegerException("Digit is over 40, input digit less than 40");
    }

    public int[] getDigit() {
        return digit;
    }

    public void parse(String input){
        for (int i = 0; i < digit.length; i++) {
     digit[i] = Character.getNumericValue(input.charAt(i));
//             digit[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }
}

public void digit2(String input){
        parse(input);

}
public int[] add(int[] array1, int[] array2){
        int carry = 0;
        int sum = 0;


    for (int i = digit.length-1; i >=0 ; i--) {
    sum =  array1[i] + array2[i] + carry;

        carry = sum(sum, solution, i);
    }
    System.out.println(Arrays.toString(solution));

    return solution;
}

    private int sum(int sum, int[] sumArray, int i) {
        int carry;
        if (sum <= 9) {
            sumArray[i] = sum;
            carry = 0;
        }
        else {
            sumArray[i] = sum - 10;
            carry = 1;
        }
        return carry;
    }


    @Override
    public String toString() {
        return "HugeIntegers{" +
                "digit=" + Arrays.toString(digit) +
                '}';
    }

    public int[] substract(int[] array1, int[] array2) {
        int sub =0 ;


        substract(array1, array2, solution);
        System.out.println(Arrays.toString(solution));

        return solution;
    }

    private void substract(int[] array1, int[] array2, int[] subArray) {
        for (int i = digit.length-1; i >=0 ; i--) {

            if (array1[i] < array2[i]){
                array1[i] += 10;
                array1[i-1] -=1;
                subArray[i] = array1[i] - array2[i];
            }

            subArray[i] = array1[i] - array2[i];
        }
    }
    public String toString(int[] digits){
        StringBuilder newNum = new StringBuilder();
        for (int j : digits) {
            newNum.append(String.valueOf(j));
        }
        return newNum.toString();
    }


    public boolean iSEqualTo(int[] digit) {
        int counter =0;
        for (int i = 0; i < digit.length; i++) {
            if (this.digit[i] == digit[i]){
          counter++;
            }
        }
        return counter == digit.length;

    }

}
