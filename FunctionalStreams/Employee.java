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
            new Employee("Heather", 120000, Department.Sales),
            new Employee("Irene", 75000, Department.Technology),
            new Employee("Jan", 130000, Department.Marketing),
            new Employee("Jennifer", 100000, Department.Accounting),
            new Employee("Jessica", 90000, Department.Sales),
            new Employee("Joan", 80000, Department.Technology),
            new Employee("Julia", 120000, Department.Marketing),
            new Employee("Karen", 75000, Department.Accounting),
            new Employee("Katherine", 130000, Department.Sales),
            new Employee("Kimberly", 100000, Department.Technology),
            new Employee("Kylie", 90000, Department.Marketing),
            new Employee("Lauren", 80000, Department.Accounting),
            new Employee("Leah", 120000, Department.Sales),
            new Employee("Lisa", 75000, Department.Technology),
            new Employee("Nicola", 130000, Department.Marketing),
            new Employee("Olivia", 100000, Department.Accounting),
            new Employee("Penelope", 90000, Department.Sales),
            new Employee("Rachel", 80000, Department.Technology),
            new Employee("Rebecca", 120000, Department.Marketing),
            new Employee("Sue", 75000, Department.Accounting),
            new Employee("Theresa", 130000, Department.Sales),
            new Employee("Tracey", 100000, Department.Technology),
            new Employee("Vanessa", 90000, Department.Marketing),
            new Employee("Victoria", 80000, Department.Accounting),
            new Employee("Virginia", 120000, Department.Sales),
            new Employee("Wanda", 75000, Department.Technology),
            new Employee("Wendy", 130000, Department.Marketing),
            new Employee("Adam", 100000, Department.Accounting),
            new Employee("Alexander", 90000, Department.Sales),
            new Employee("Andrew", 80000, Department.Technology),
            new Employee("Anthony", 120000, Department.Marketing),
            new Employee("Benjamin", 75000, Department.Accounting),
            new Employee("Blake", 130000, Department.Sales),
            new Employee("Brandon", 100000, Department.Technology),
            new Employee("Carl", 90000, Department.Marketing),
            new Employee("Charles", 80000, Department.Accounting),
            new Employee("Christopher", 120000, Department.Sales),
            new Employee("Dan", 75000, Department.Technology),
            new Employee("David", 130000, Department.Marketing),
            new Employee("Edward", 100000, Department.Accounting),
            new Employee("Eric", 90000, Department.Sales),
            new Employee("Frank", 80000, Department.Technology),
            new Employee("Gordon", 120000, Department.Marketing),
            new Employee("Harry", 75000, Department.Accounting),
            new Employee("Isaac", 130000, Department.Sales),
            new Employee("Jacob", 100000, Department.Technology),
            new Employee("James", 90000, Department.Marketing),
            new Employee("Jason", 80000, Department.Accounting),
            new Employee("John", 120000, Department.Sales),
            new Employee("Joseph", 75000, Department.Technology),
            new Employee("Justin", 130000, Department.Marketing),
            new Employee("Keith", 100000, Department.Accounting),
            new Employee("Kevin", 90000, Department.Sales),
            new Employee("Luke", 80000, Department.Technology),
            new Employee("Matt", 120000, Department.Marketing),
            new Employee("Michael", 75000, Department.Accounting),
            new Employee("Nathan", 130000, Department.Sales),
            new Employee("Neil", 100000, Department.Technology),
            new Employee("Oliver", 90000, Department.Marketing),
            new Employee("Owen", 80000, Department.Accounting),
            new Employee("Paul", 120000, Department.Sales),
            new Employee("Peter", 75000, Department.Technology),
            new Employee("Richard", 130000, Department.Marketing),
            new Employee("Robert", 100000, Department.Accounting),
            new Employee("Sam", 90000, Department.Sales),
            new Employee("Sean", 80000, Department.Technology),
            new Employee("Simon", 120000, Department.Marketing),
            new Employee("Tim", 75000, Department.Accounting),
            new Employee("Warren", 130000, Department.Sales)
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