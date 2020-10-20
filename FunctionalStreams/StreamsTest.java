import org.junit.jupiter.api.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static Employee.createEmployees;

public class StreamTest {
    @Test
    public void doubleTheEvenNumbersAndTotalThem() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        assertEquals(60, Streams.totalDoubleEvens(numbers));
    }

    @Test
    public void totalPricesGreaterThan20ButDiscountTheDifferenceFrom20By10Percent() {
        List<Double> prices = Arrays.asList(10.0, 30.0, 40.0, 50.0);
        assertEquals(114.0, Streams.totalPrices(prices), 0.001);
    }

    @Test
    public void getReverseSortedListOfNamesOfMarketingEmployeesMakingAtLeast100000() {
        List<String> names = Arrays.asList("Wendy", "Simon", "Richard", "Rebecca", "Nicola", "Matt", "Justin", "Julia", "Jan", "Gordon", "Diane", "David", "Carol", "Anthony");
        List<Employee> employees = createEmployees();
        assertEquals(names, Streams.findMarketingNames(employees));
    }

    @Test
    public void groupTechnologyEmployeeNamesBySalary() {
        Map<Integer, List<String>> namesBySalary = new HashMap<>() {{
            put(80000, Arrays.asList("Deirdre", "Joan", "Rachel", "Andrew", "Frank", "Luke", "Sean"));
            put(100000, Arrays.asList("Abigail", "Gabrielle", "Kimberly", "Tracey", "Brandon", "Jacob", "Neil"));
            put(75000, Arrays.asList("Bernadette", "Irene", "Lisa", "Wanda", "Dan", "Joseph", "Peter"));
        }};
        List<Employee> employees = createEmployees();
        assertEquals(namesBySalary, Streams.groupTechnologyEmployeeNamesBySalary(employees));
    }

    @Test
    public void getAverageSalariesByDepartment() {
        List<Employee> employees = createEmployees();
        Map<Department, Double> averageSalariesByDepartment = Streams.getAverageSalariesByDepartment(employees);
        assertEquals(85000.00, averageSalariesByDepartment.get(Department.Accounting), 0.01);
        assertEquals(113333.33, averageSalariesByDepartment.get(Department.Marketing), 0.01);
        assertEquals(113333.33, averageSalariesByDepartment.get(Department.Sales), 0.01);
        assertEquals(85000.00, averageSalariesByDepartment.get(Department.Technology), 0.01);
    }

    @Test
    public void getTheHighestSalaryOfNamesStartingWithTheLetterK() {
        List<Employee> employees = createEmployees();
        assertEquals(130000, Streams.getHighestSalaryOfKNames(employees));
    }

    @Test
    public void getUniqueSalariesSortedGreatestToLeast() {
        List<Employee> employees = createEmployees();
        List<Integer> salaries = Arrays.asList(130000, 120000, 100000, 90000, 80000, 75000);
        assertIterableEquals(salaries, Streams.determineSortedUniqueSalaries(employees));
    }

}
