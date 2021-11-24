import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private int department;
    private String name;

    public Employee(int id, int department, String name) {
        super();
        this.id = id;
        this.department = department;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "name: " + name;
    }

}

public class GroupingBy {

    public static void main(String[] args) {
        List< Employee > employees = Arrays.asList(
                new Employee(1, 10, "Chandra"),
                new Employee(2, 20, "Rajesh"),
                new Employee(3, 30, "Rahul"),
                new Employee(4, 10, "Ramana"),
                new Employee(5, 20, "Saichetan"),
                new Employee(6, 20, "Ramya"));

        Map<Integer, List<Employee>> groupByDept = employees.stream().collect(
                Collectors.groupingBy(e -> e.getDepartment()));

        System.out.println(groupByDept);
    }
}
