package Deitel.chapter_7;


public class Array {
    public static int[] sort;


    public static void main(String[] args) {
        int [] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        System.out.println("GRADE DISTRIBUTION");

        for (int counter = 0; counter < array.length; counter++) {
            if ( counter ==10 ){
                System.out.printf("%7d: ", 100);
            }else {
                System.out.printf("%2d - %2d: ",
                        counter * 10, counter * 10 + 9);
            }
            for (int star = 0; star< array[counter]; star++){
                System.out.print("*");
            }
                System.out.println();


    }
}
}
