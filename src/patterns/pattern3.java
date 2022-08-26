package patterns;

public class pattern3 {
    public static void main(String[] args) {
        pattern3(10);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for(int space = 0; space < n-row; space++){
                System.out.print("  ");
            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print("*"+ " ");
            }
            System.out.println();

        }
    }

}
