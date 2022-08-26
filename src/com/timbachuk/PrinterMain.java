package com.timbachuk;

public class PrinterMain {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println("The available toner level is: "+printer.getTonerLevel());
        printer.fillUpToner(50);
        System.out.println("The available toner level is: "+printer.getTonerLevel());
        //printer.fillUpToner(50);
       // System.out.println("The available toner level is: "+printer.getTonerLevel());
        System.out.println("Number of printed pages are: "+ printer.NumberOfPages(23)+ " number of pages are: "+printer.getNumberOfPages());
        System.out.println("Number of printed pages are: "+ printer.NumberOfPages(51)+ " number of pages are: "+printer.getNumberOfPages());



    }


}
