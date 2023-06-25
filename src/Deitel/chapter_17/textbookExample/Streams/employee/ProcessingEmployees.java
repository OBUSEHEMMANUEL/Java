package Deitel.chapter_17.textbookExample.Streams.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees {
    public static void main(String[] args) {
        Employee[] employee = {
                new Employee("DEREK","MANUEL",750000,"IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                 new Employee("James", "Indigo", 4700.77, "Marketing"),
                 new Employee("Luke", "Indigo", 6200, "IT"),
                 new Employee("Jason", "Blue", 3200, "Sales"),
                 new Employee("Wendy", "Brown", 4236.4, "Marketing")

        };

//       Arrays.stream(employee).toList().forEach(System.out::println);
       var list = Arrays.asList(employee);
        Predicate<Employee> predicate = (e)->e.getSalary() >=4000 && e.getSalary() <= 2000;
       list.stream().filter(e->e.getSalary()>=4000 && e.getSalary()<=6000)
           .sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

        Function<Employee,String> byFirstName = Employee::getFirstName;

        Function<Employee,String> byLastName = Employee::getLastName;


var lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);
list.stream().sorted(lastThenFirst).forEach(System.out::println);


        System.out.println();

        Map<String, List<Employee>> groupedByDepartment = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        groupedByDepartment.forEach((department,employeesInDepartment)->{
            System.out.println(department+" ");
            employeesInDepartment.forEach(System.out::println);

            System.out.println();
            System.out.println();
         var numberOfDepartment =   list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

            numberOfDepartment.forEach((departments,count) -> System.out.printf("%s has %d employee(s)%n", departments,count ));
        });































    }
}
