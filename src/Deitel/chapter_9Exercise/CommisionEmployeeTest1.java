package Deitel.chapter_9Exercise;

public class CommisionEmployeeTest1 {
    public static void main(String[] args) {
        CommissionEmployee1 employee = new CommissionEmployee1("Derek","Emmanuel","345-2345-44",10000,.06);
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is",employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is",employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is",employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is",employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is",employee.getCommissionRate());
        employee.setGrossSales(5000);
        employee.setCommissionRate(.1);
        System.out.printf("%n%s:%n%n %s%n","Updated employee information obtained by toString",employee);
    }
}
