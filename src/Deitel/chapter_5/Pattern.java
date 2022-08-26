package Deitel.chapter_5;

public class Pattern {
    public static void main(String[] args) {

        pattern5(5);
    }

    public static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 4; column >= row; column--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column+ " ");
            }
            System.out.println();
        }

    }
    public static void pattern4(int n) {
        for (int row = 1; row <= 2*n; row++) {
            int c = row > n? 2*n -row : row;
            for (int column = 1; column <= c ; column++) {
                System.out.print(column+ " ");
            }
            System.out.println();
        }

    }
    public static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row ; space++) {
                System.out.print(" ");
            }
                for (int column = 1; column <= row; column++) {
                    System.out.print(column+" ");
                }
                System.out.println();
            }


    }
}