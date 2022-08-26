package Deitel.chapter_9Exercise;

public class HourlyEmployeeTest {
    public static void main(String[] args) {
        HourlyEmployee employee = new HourlyEmployee("Derek","Emmanuel","345-2345-44",10,500);
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is",employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is",employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is",employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Hours are",employee.getHours());
        System.out.printf("%s %.2f%n", "Wages is",employee.getWages());
        System.out.printf("%s %.2f%n", "Earnings is",employee.earning());
        employee.setHours(50);
        employee.setWages(300);
        System.out.printf("%n%s:%n%n %s%n","Updated employee information obtained by toString",employee);
    }
}
