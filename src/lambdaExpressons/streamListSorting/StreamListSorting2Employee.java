package lambdaExpressons.streamListSorting;

import Deitel.chapter_17.textbookExample.Streams.employee.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting2Employee {
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

        List<Employee> sortedList = Arrays.stream(employee).sorted(((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))).collect(Collectors.toList());
        System.out.println(sortedList);

//        List<Employee> sortedList1 = Arrays.stream(employee)
//                .sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
    }
}
