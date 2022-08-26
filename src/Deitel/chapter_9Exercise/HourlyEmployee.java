package Deitel.chapter_9Exercise;

public class HourlyEmployee extends Employee{
    private double hours;
    private double wages;
    public HourlyEmployee(String firstName, String lastname, String socialSecurityNUmber,double hours,double wages) {
        super(firstName, lastname, socialSecurityNUmber);
        if (wages < 0.0) {
            throw new IllegalArgumentException("Wages must be > 0");
        }
        {
            this.wages = wages;
        }
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Hours must be > 0 and < 168");
        }
        {
            this.hours = hours;
        }
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Hours must be > 0 and < 168");
        }
        {
            this.hours = hours;
        }
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        if(wages < 0.0){
            throw new IllegalArgumentException("Wages must be > 0");}
        {this.wages = wages;
        }
    }
    public double earning(){
        return hours * wages;
    }
    @Override
    public String toString(){
        return  String.format(" %s%n Hourly: %.2f%n Wages: %.2f%n Earnings: %.2f%n",
                super.toString(),getHours(),getWages(),earning());
    }
}
