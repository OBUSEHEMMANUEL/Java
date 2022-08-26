package Deitel.chapter_9Exercise;

public class CommissionEmployee1 extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee1(String firstName, String lastname, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastname, socialSecurityNumber);
        if(commissionRate < 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("Commission Rate must be <= 0.0 or >= 1.0 ");
        }{
        this.commissionRate = commissionRate;
    }
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross Sales is >=0.0");
        }

        this.grossSales = grossSales;
    }



    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross Sales is >=0.0");
        }

        this.grossSales = grossSales;
    }


    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate < 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("Commission Rate must be <= 0.0 or >= 1.0 ");
        }
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString(){
        return String.format("print out toString %s%n Gross Sales: %.2f%n Commission Rate: %.2f%n Earning: %.2f", super.toString(), getGrossSales(),getCommissionRate(), earning());
    }

    @Override
    public double earning() {
        return grossSales * commissionRate ;
    }

}
