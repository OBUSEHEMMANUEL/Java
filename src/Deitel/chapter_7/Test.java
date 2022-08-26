package Deitel.chapter_7;

public class Test {
    public static void main(String[] args) {
      int  total = 0;
        int [] grades = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        for(int counter =0; counter < grades.length; counter++){
             total = total + grades[counter];

        }
        System.out.printf("%d",total);
    }
}
