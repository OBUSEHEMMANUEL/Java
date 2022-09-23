package volume;

import java.util.Scanner;

public class Main {
  static   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println("Enter Height");
        cylinder.setHeight(print());
        scanner.nextLine();
        System.out.println("Enter Radius");
        cylinder.setRadius(print());
        scanner.nextLine();
        System.out.println("Enter Volume");
        cylinder.setVolume(print());

        System.out.println("CYLINDER: " + cylinder.total());


    }
    private static int print(){
        return scanner.nextInt();
    }
}
