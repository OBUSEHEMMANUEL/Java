package ac;

public class Ac {
    private String on;
    private String off;
    private int temp = 18;
    public void isOn (String on){
        this.on = on;
        }
        public String getIsOn (){
            return on;
        }


    public void isOff (String off)  {
         this.off = off;
        }
        public String getIsOff (){
        return off;
    }
    public int increaseTemp() {
        if

        (temp >= 30) {
            return 30;


        }
        temp++;
        return temp;

    }

    public int decreaseTemp(){
        if (temp < 17) {
            return 16;

        }

        temp--;
         return temp;
    }
}


