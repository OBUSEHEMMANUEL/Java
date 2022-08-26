package Assignment;

import java.util.Scanner;

public class HighestNumber {
   static Scanner input =  new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter first number");
        int x = input.nextInt();
        System.out.println("Enter second number");
        int y = input.nextInt();
        System.out.println("Enter Third number");
        int z = input.nextInt();
        System.out.println("Enter forth number");
        int a = input.nextInt();
        System.out.println("Enter fifth number");
        int b = input.nextInt();
        if (x > y && x > z && x >a && x >b){
            System.out.println("MAXIMUM NUMBER: "+ x);
        }if( y>x && y>z && y >a && y>b  ){
            System.out.println("MAXIMUM NUMBER: "+ y);
        }if(z>x && z>y && z>a && z>b){
            System.out.println("MAXIMUM NUMBER: "+ z);
        }if(a>x && a>y && a>z && a>b){
            System.out.println("MAXIMUM NUMBER: "+ a);
        }if (b>x&& b>y &&b>z && b>a){
            System.out.println("MAXIMUM NUMBER: "+ b);
        }
        if (x < y && x < z && x <a && x <b){
            System.out.println("MINIMUM NUMBER: "+ x);
        }if( y<x && y<z && y <a && y<b  ){
            System.out.println("MINIMUM NUMBER: "+ y);
        }if(z<x && z<y && z<a && z<b){
            System.out.println("MINIMUM NUMBER: "+ z);
        }if(a<x && a<y && a<z && a<b){
            System.out.println("MINIMUM NUMBER: "+ a);
        }if (b<x&& b<y &&b<z && b<a){
            System.out.println("MINIMUM NUMBER: "+ x);
        }





    }
}
