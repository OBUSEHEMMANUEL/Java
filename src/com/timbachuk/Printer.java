package com.timbachuk;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPages;
    private  boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        this.tonerLevel = this.tonerLevel - tonerLevel;

        if(duplexPrinter == true) {
            this.duplexPrinter = duplexPrinter;
        }
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }
    public  boolean getsDuplexPrinter() {
       return duplexPrinter;
    }
    public int NumberOfPages(int numberOfPages){
        int printPage = numberOfPages;
            if(this.duplexPrinter){
              printPage = (numberOfPages/2) + (numberOfPages%2);
                System.out.println("printer can print on both side");
            }
        this.numberOfPages +=printPage;

        return printPage;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int fillUpToner(int toner){

        if(tonerLevel>0 && tonerLevel < 100 ){
            this.tonerLevel+= toner;
        }else throw new IllegalArgumentException("TONER IS FILLED UP");
        return this.tonerLevel;
    }
}
