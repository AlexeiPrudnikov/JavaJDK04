public class Employee implements Comparable{
    private String serviceNumber;
    private String name;
    private String phoneNumber;
    private int experience;

    public String getServiceNumber() {
        return serviceNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Employee(String serviceNumber, String name, String phoneNumber, int experience) {
        if (serviceNumber == null || serviceNumber.isEmpty()) throw new NullPointerException("Ошибка, табельный должен быть задан");
        this.serviceNumber = serviceNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }
    public Employee(String serviceNumber, String name, String phoneNumber){
        this(serviceNumber, name, phoneNumber, 0);
    }
    public Employee(String serviceNumber, String name){
        this(serviceNumber,name, "-");
    }
    public Employee(String serviceNumber){
        this(serviceNumber, "-");
    }
    @Override
    public String toString() {
        return serviceNumber + ": " + name + ", " + phoneNumber + ", " + experience;
    }

    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee) obj;
        if (serviceNumber.equals(emp.serviceNumber)) return true;
        return false;
    }

    @Override
    public int compareTo(Object o) {
        Employee emp = (Employee) o;
        return name.compareTo(emp.getName());
    }
}
