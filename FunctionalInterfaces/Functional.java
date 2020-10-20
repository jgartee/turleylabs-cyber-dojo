import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Functional {
    private ArrayList<String> names;
    public Predicate<Employee> makesLessThan100k = null; // TODO: fill in this lambda 
    public Function<Employee, String> employeeName = null; // TODO: fill in this lambda
    public Consumer<String> addName = null; // TODO: fill in this lambda

    public Functional(ArrayList<String> names) {
        this.names = names;
    }

    public void getNamesOfEmployeesMakingLessThan100k(List<Employee> employees, ArrayList<String> names) {
        for(Employee employee : employees) {
            if (makesLessThan100k.test(employee)) {
                String name = employeeName.apply(employee);
                addName.accept(name);
            }
        }
    }
}
