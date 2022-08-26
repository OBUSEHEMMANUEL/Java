package Deitel.chapter_9;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;


    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityName, double grossSale, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityName, grossSale, commissionRate);
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("base salary must be  >= 0.0");
        }
        {
            this.baseSalary = baseSalary;
        }
    }
        public double getBaseSalary() {
            return baseSalary;
        }

        public void setBaseSalary(double baseSalary) {
            this.baseSalary = baseSalary;
        }
        @Override
        public double earning(){
        return baseSalary + (super.earnings());
        }
        public String toString(){
        return String.format(" to string input%S  Base salary: %.2f ", super.toString(),getBaseSalary());
        }


    }


