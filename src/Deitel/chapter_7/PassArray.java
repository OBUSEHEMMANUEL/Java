package Deitel.chapter_7;

public class PassArray {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        System.out.printf("%nTHE VALUE OF THE ORIGINAL ARRAY ARE:%n");

        for (int value =0; value< array.length; value++){
            System.out.printf(" %d", value);

        }
        modifyArray(array);
        System.out.printf("%nModified values%n");

            for(int value : array){
                System.out.printf(" %d",value);
            }
        System.out.printf("%nARRAY[3]: %n%d%n", array[3]);


        modifyElement(array[3] + array[4]);
        System.out.println("MODIFIED ELEMENT array[3]:");
        System.out.printf(" %d" , array[3] + array[4]);
    }

    public static void modifyArray(int [] array2){
        for (int counter = 0; counter< array2.length; counter++){
            array2[counter] *= 2;
        }
    }
    public static void modifyElement(int element){
        element *=2;
        System.out.println("value of element: " + element);
    }
}
