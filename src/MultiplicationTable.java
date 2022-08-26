public class MultiplicationTable {
    public static void main(String[] args) {
        table();
    }
    public static void newLine(){
        for (int i = 0; i <250 ; i++) {
            System.out.print("*");
        }
    }
    public static void table(){
        newLine();
        System.out.printf("%n%100s%n","MULTIPLICATION TABLE");
        newLine();
        for (int row = 0; row < 12; row++) {
            for (int column = 1; column < 13; column++) {
                System.out.printf("%2d * %2d = %2d  ",column,row,(row * column));

            }
            System.out.println();

        }

    }
}
