import java.util.Collections;
import java.util.List;

public class Main {
    public static void printEmployees(List<Employee> empList){
        for (Employee emp: empList) {
            System.out.println(emp.toString());
        }
    }
    public static void main(String[] args) {
        Guide guide = new Guide();
        guide.add(new Employee("E1"));
        guide.add(new Employee("E2", "Иванов", "79102345678", 2));
        guide.add(new Employee("E3", "Петров", "79101234567", 2));
        guide.add(new Employee("E8", "Сидоров", "79107654321", 3));
        guide.add(new Employee("E5", "Батонов", "79102345678", 3));
        guide.add(new Employee("E6", "Булочкин", "79101234567", 4));
        printEmployees(guide.getEmployeeByPhone("79101234567"));
        System.out.println();
        printEmployees(guide.getEmployeesByExp(3));
        System.out.println();
        System.out.println(guide.getEmployeeByServiceNumber("E1"));
    }
}