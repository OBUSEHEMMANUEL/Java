package turtle;

public class Sketchpad {
   private  int[][] floor;
    private  int noOfRow;
    private int  noOfColumn;
    public Sketchpad(int noOfRow, int  noOfColumn){
        floor = new int [noOfRow][noOfColumn];
        this.noOfColumn = noOfColumn;
                this.noOfRow =noOfRow;
    }

    public int[][] getFloor() {
        return floor;
    }
    public  void displayFloor(){
        System.out.println("RESULT");
        for (int rows = 0; rows < noOfRow ; rows++) {
            for (int columns = 0; columns <noOfColumn ; columns++) {
                if(floor [rows][columns] == 1) System.out.print(" X ");
                else System.out.print( " - " );
                System.out.print( " | " );
            }
            System.out.println( );
        }

    }
}
