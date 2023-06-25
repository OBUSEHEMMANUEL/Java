package Deitel.chapter_17.excercise;

import Deitel.chapter_17.textbookExample.Streams.employee.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.DoubleStream;

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee[] employee = {
                new Employee("DEREK","MANUEL",750000,"IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee(
                        "Jason", "Red", 5000, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")

        };
       var list= Arrays.asList(employee);

        System.out.println(list.stream().flatMapToDouble(n -> DoubleStream.of(n.getSalary())).average().getAsDouble());
    }
}
