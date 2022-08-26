package Assignment;

public class SevenSegment {
    private static final int[][] segments = new int[5][4];

    public static void main(String[] args) throws InterruptedException, IllegalAccessException {
        input("11110011");
        displayName();
    }

    public static void displayName() throws InterruptedException {

        for (int[] segment : segments) {
            for (int j : segment) {
                if (j == 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                    Thread.sleep(700);
                }
            }
            System.out.println();
        }
    }
    public static void fillA() {
        segments[0][0] = 1;
        segments[0][1] = 1;
        segments[0][2] = 1;
        segments[0][3] = 1;
    }

    public static void fillB() {
        segments[0][3] = 1;
        segments[1][3] = 1;
        segments[2][3] = 1;
    }

    public static void fillC() {
        segments[2][3] = 1;
        segments[3][3] = 1;
        segments[4][3] = 1;
    }

    public static void fillD() {
        segments[4][0] = 1;
        segments[4][1] = 1;
        segments[4][2] = 1;
        segments[4][3] = 1;
    }

    public static void fillE() {
        segments[2][0] = 1;
        segments[3][0] = 1;
        segments[4][0] = 1;
    }

    public static void fillF() {
        segments[0][0] = 1;
        segments[1][0] = 1;
        segments[2][0] = 1;
    }

    public static void fillG() {
        segments[2][0] = 1;
        segments[2][1] = 1;
        segments[2][2] = 1;
        segments[2][3] = 1;

    }
//    public static void fillG1(){
//
//        for(int row = 0; row < segment.length; row++){
//            for (int column =0; column < segment[row].length;column++ )
//
//        }
    public static void input(String input) throws IllegalAccessException, InterruptedException{
        char [] fill = input.toCharArray();
    if (fill[fill.length - 1] == '0') {
        System.out.println("");
        return;
    }
        for (char i : fill ){
            if (!(i == '1' || i == '0')) {
                throw new IllegalAccessException("only 1's and 0's Accepted");
            }
        }
        if (input.length() > 8 ){
            input = input.substring(0,8);
        }
     for (int i = 0; i < input.length(); i++ ){
         if(input.charAt(i) == '1')
             switch (i) {
             case 0 ->
                 fillA();
             case 1->
                 fillB();
             case 2->
                 fillC();
                 case 3 -> fillD();
             case 4->
                 fillE();
             case 5->
                 fillF();
             case 6->
                 fillG();

         }
             }


         }
    }