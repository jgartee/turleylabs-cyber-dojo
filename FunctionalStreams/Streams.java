import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Streams {
    public static Integer totalDoubleEvens(List<Integer> numbers) {
        return numbers.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .reduce(0, Integer::sum);
    }

    public static Double totalPrices(List<Double> prices) {
        return prices.stream()
                .filter(d -> d > 20)
                .map(d -> d - ((d - 20) * .1))
                .reduce(0.0, Double::sum);
    }

    public static List<String> findMarketingNames(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.getDepartment() == Department.Marketing)
                .filter(e -> e.getSalary() >= 100000)
                .map(Employee::getName)
                .sorted(Comparator.reverseOrder())
                .collect(toList());
    }

    public static Map<Integer, List<String>> groupTechnologyEmployeeNamesBySalary(List<Employee> employees) {
        // Use auto-complete to explore static functions available in Collectors
        return employees.stream()
                .filter(e -> e.getDepartment() == Department.Technology)
                .collect(groupingBy(Employee::getSalary, mapping(Employee::getName, toList())));
    }

    public static Map<Department, Double> getAverageSalariesByDepartment(List<Employee> employees) {
        // Use auto-complete to explore static functions available in Collectors
        return employees.stream()
                .collect(groupingBy(Employee::getDepartment, averagingDouble(Employee::getSalary)));
    }

    public static int getHighestSalaryOfKNames(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.getName().startsWith("K"))
                .map(Employee::getSalary)
                .max(Integer::compareTo)
                .orElse(0);
    }

    public static Iterable<Integer> determineSortedUniqueSalaries(List<Employee> employees) {
        return employees.stream()
                .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .collect(toSet());
    }
}
