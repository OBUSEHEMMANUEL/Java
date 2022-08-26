package Kelechi;

public class MinutesAndSeconds {
    public int minutes;
    public final int second = 60;

   public MinutesAndSeconds(){

   }
    public MinutesAndSeconds(int minutes) {
        if (minutes >= 0 && minutes <= 60) {
            this.minutes = minutes;
        }

    }

    public int getMinutes() {

        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int calMinAndSec(){
        return minutes * second;
    }

}
