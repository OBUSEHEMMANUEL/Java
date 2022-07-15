package Chapter_3;



public class Clock {
    private int hour= 0;
    private int minute= 0;
    private int second= 0;

    public Clock(int hour,int minute,int second){
        if(second < 24 && second > 0) {
            this.second = second;
        }
        if (minute > 0 && minute < 24) {
            this.minute = minute;
        }
        if (hour < 24 && hour > 0){
            this.hour = hour;
        }
    }
    public void setHour(int hour){
        if (hour <  24 && hour > 0){
            this.hour = hour;
        }
    }
    public int getHour(){
        return hour;
    }
    public void setMinute(int minute){
        if (minute > 0 && minute < 24) {
            this.minute = minute;
        }
    }
    public int getMinute(){
        return minute;
    }
    public void setSecond(int second) {
        if (second < 24 && second > 0) {
            this.second = second;
        }
    }
    public int getSecond(){
        return second;
    }
}
