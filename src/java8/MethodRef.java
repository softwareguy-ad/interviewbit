package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MethodRef {

    /*

    Method reference works default with static methods
    studsNames.forEach(System.out::println);

    for a instance method we have to pass a obj of that class
    */
    public static void main(String[] args) {
        Student s1 = new Student(1,"Akshay");
        Student s2 = new Student(2, "Ravi");

        List<Student> studList = new ArrayList<>();
        studList.add(s1);
        studList.add(s2);

        //Method Ref with static method
        Set<String> studsNames = studList.stream().map(Student::getName).collect(Collectors.toSet());
        studsNames.forEach(System.out::println);

        Student student = new Student();
        //Method ref with non static method
        studList.stream().map(e->e.getName()).map(student::getNameAndIdNon).forEach(System.out::println);


        //Constructor ref
        List<StuName> nameObjsList = studsNames.stream().map(StuName::new).collect(Collectors.toList());
    }
}
