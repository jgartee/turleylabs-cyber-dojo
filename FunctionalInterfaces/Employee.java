import java.util.Arrays;
import java.util.List;

public class Employee {
    private String name;
    private int salary;
    private Department department;

    public static List<Employee> createEmployees() {
        return Arrays.asList(
                new Employee("Abigail", 100000, Department.Technology),
                new Employee("Angela", 90000, Department.Marketing),
                new Employee("Anna", 80000, Department.Accounting),
                new Employee("Bella", 120000, Department.Sales),
                new Employee("Bernadette", 75000, Department.Technology),
                new Employee("Carol", 130000, Department.Marketing),
                new Employee("Caroline", 100000, Department.Accounting),
                new Employee("Claire", 90000, Department.Sales),
                new Employee("Deirdre", 80000, Department.Technology),
                new Employee("Diane", 120000, Department.Marketing),
                new Employee("Felicity", 75000, Department.Accounting),
                new Employee("Fiona", 130000, Department.Sales),
                new Employee("Gabrielle", 100000, Department.Technology),
                new Employee("Grace", 90000, Department.Marketing),
                new Employee("Hannah", 80000, Department.Accounting),
                new Employee("Heather", 120000, Department.Sales)
        );
    }



    public Employee(String name, int salary, Department department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}