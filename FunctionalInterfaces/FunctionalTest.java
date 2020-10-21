import org.junit.jupiter.api.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

public class FunctionalTest {

    private final ArrayList<String> names = new ArrayList<>();
    private final Functional functional = new Functional(names);
    private final List<String> expectedNames = Arrays.asList("Angela", "Anna", "Bernadette", "Claire", "Deirdre", "Felicity", "Grace", "Hannah");
    private final Employee employee = new Employee("Angela", 90000, Department.Marketing);

    @Test
    public void makesLessThan100k() {
        assertNotNull(functional.makesLessThan100k);
        assertTrue(functional.makesLessThan100k.test(employee));
    }

    @Test
    public void employeeName() {
        assertNotNull(functional.employeeName);
        assertEquals("Angela", functional.employeeName.apply(employee));
    }

    @Test
    public void addName() {
        assertNotNull(functional.addName);
        functional.addName.accept("Angela");
        assertEquals(Arrays.asList("Angela"), names);
    }

    @Test
    void getNamesOfEmployeesOlderThan34() {
        assertNotNull(functional.makesLessThan100k);
        assertNotNull(functional.employeeName);
        assertNotNull(functional.addName);
        List<Employee> employees = Employee.createEmployees();
        functional.getNamesOfEmployeesMakingLessThan100k(employees);
        assertEquals(expectedNames, names);
    }


}