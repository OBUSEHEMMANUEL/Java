package Deitel.chapter_8;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();

        displayTime("After time is created", time);
        System.out.println();

        time.setTime(13,27,6);
        displayTime("After calling set Time", time);

try{
    time.setTime(99,99,99);
}catch (IllegalArgumentException e){
    System.out.printf("Exception message %s%n%n", e.getMessage());

}


}

    private static void displayTime(String header, Time1 t){
        System.out.printf("%s%n Universal Time: %s%n Standard Time: %s%n", header, t.toUniversalString(),t.toString());

    }
}
