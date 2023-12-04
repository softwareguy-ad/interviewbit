package company;

public class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private String salary;

    @Override
    public String toString() {
        return "company.Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Employee(String name, int id, String salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}
