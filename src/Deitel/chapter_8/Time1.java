package Deitel.chapter_8;

public class Time1 {
    private int hour;
    private int minute;
    private int second;


    public void setTime(int hour,int minute,int second){
        validate(hour, minute, second);
        this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

    private static void validate(int hour, int minute, int second) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    private static void validateHour(int hour) {
        if(hour < 0 || hour >= 24)throw new IllegalArgumentException
                (String.format(" Hour you entered is %d. you Exceeded hour , Enter hour between 0-23",hour));
    }

    private static void validateMinute(int minute) {
        if (minute < 0 || minute >= 60 )throw new IllegalArgumentException("Exceeded minutes, Enter minutes between 0-59");
    }

    private static void validateSecond(int second) {
        if (second < 0 || second >= 60) throw new IllegalArgumentException("Exceeded second, Enter seconds between 0-59");
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d ",hour,minute,second);
    }
    public String toString(){
        return String.format("%d:%02d:%02d %s",((hour==0 || hour ==12)? 12:hour %12),
                minute,second,(hour<12? "AM":"PM"));
    }
}