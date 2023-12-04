package streams;

import bean.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Excecutor {
    public static void main(String[] args) {
        int [] numbers = {1,4,5,2,3,0,9};
        IntStream.of(numbers).min().ifPresent(System.out::println);

        IntStream.of(numbers).filter(i->i%2==0).forEach(System.out::println);

        List<Integer> list = IntStream.of(numbers).filter(i->i%2==0).boxed().collect(Collectors.toList());

        Student student1 = new Student(4,"rahul", "2");
        Student student2 = new Student(1,"ravi", "100");
        Student student3 = new Student(2,"chandra", "1300");
        Student student4 = new Student(6,"chaman", "10");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        /*studentList.stream().map(Student::getName).forEach(System.out::println);

        System.out.println("After sorting it .");
        studentList.stream().sorted().map(Student::getName).forEach(System.out::println);
        System.out.println("After doing it.");
        studentList.stream().map(Student::getName).forEach(System.out::println);
*/
        studentList.stream().sorted().sorted((i,j)->i.getMarks().compareTo(j.getMarks())).map(Student::getName).forEach(System.out::println);



    }


}
