import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Guide {
    private Map<String, Employee> guide;

    public Guide() {
        guide = new HashMap();
    }

    public void add(Employee emp) {
        if (emp == null) throw new NullPointerException("Добавляемый объект не должен быть null");
        guide.put(emp.getServiceNumber(), emp);
    }

    public void delete(String serviceNumber) {
        guide.remove(serviceNumber);
    }

    public void clear() {
        guide.clear();
    }

    public Employee getEmployeeByServiceNumber(String serviceNumber) {
        return guide.get(serviceNumber);
    }

    public List<Employee> getEmployeeByPhone(String phoneNumber) {
        List<Employee> empList = new ArrayList<>();
        for (String key : guide.keySet()) {
            Employee emp = guide.get(key);
            if (emp.getPhoneNumber().equals(phoneNumber)){
                empList.add(emp);
            }
        }
        return empList;
    }
    public List<Employee> getEmployeesByExp(int exp){
        List<Employee> empList = new ArrayList<>();
        for (String key : guide.keySet()) {
            Employee emp = guide.get(key);
            if (emp.getExperience() == exp){
                empList.add(emp);
            }
        }
        return empList;
    }
}
