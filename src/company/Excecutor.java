package company;

import java.util.*;

public class Excecutor {
    public static void main(String[] args) {
        Employee employee = new Employee("akshay", 90, "1001");
        Employee employee2 = new Employee("ravi", 100, "908");
        Employee employee3 = new Employee("raju", 69, "7890");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee2);
        employeeList.add(employee3);

        for(Employee emp: employeeList){
            System.out.println(emp);
        }

        Collections.sort(employeeList);

        employeeList.stream().forEach(System.out::println);

        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        employeeList.stream().forEach(System.out::println);

        HashMap<String, Employee> emap = new HashMap<>();
        emap.put(employee.getName(), employee);
        emap.put(employee2.getName(), employee2);
        emap.put(employee3.getName(), employee3);

        System.out.println("Map of employee");

        emap.entrySet().stream().forEach(i-> System.out.println(i.getKey() +" \t"+ i.getValue()));

        TreeMap<String , Employee> employeeTreeMap = new TreeMap<>(emap);

        System.out.println("After sorting map");

        employeeTreeMap.entrySet().stream().forEach(i-> System.out.println(i.getKey() +" \t"+ i.getValue()));




    }
}
