package example;

public class ArrayOfNumbers {

    public static void main(String[] args) {
        int total = 0;
        int [] numbers = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        for(int number :  numbers){
            total = total + number;
            System.out.println(total);

        }

    }
}
