package Deitel.chapter_9;

public abstract class CommissionEmployee extends Object {
    private String firstName;
    private String lastname;
    private String socialSecurityNUmber;
    private double grossSales;
    private double commissionRate;


    public CommissionEmployee(String firstName, String lastname, String socialSecurityNUmber, double grossSales, double commissionRate){
        this.firstName = firstName;
        this.lastname = lastname;
        this.socialSecurityNUmber = socialSecurityNUmber;

        if(grossSales < 0.0){
            throw new IllegalArgumentException("must be > 0.0");
        }
        this.grossSales = grossSales;

        if(commissionRate < 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("CommissionSale must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;

    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNUmber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0){
            throw new IllegalArgumentException("must be > 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate < 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("CommissionSale must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }
    public double earnings(){
        return grossSales * commissionRate;
    }

    public abstract double earning();

    @Override
    public String toString(){
        return  String.format("%s: %s %s%n %s: %s%n %s: %.2f%n %s:%.2f%n ",
                "FIRSTNAME", firstName,lastname, "SOCIAL SECURITY NUMBER", socialSecurityNUmber,
                "GROSS SALES", grossSales,"COMMISSION SALES", commissionRate);
    }
}
