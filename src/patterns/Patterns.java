package patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern2(5);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {

            for (int s = 0; s < n - row; s++) {
                System.out.print("   ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(" * ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {

            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(row);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();

        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {

            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();

        }
    }

        }

