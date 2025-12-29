package streams;

import bean.Student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Excecutor {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 2, 3, 0, 9};

        IntStream.of(numbers).max().ifPresent(System.out::println);

        List<Integer> list = IntStream.of(numbers).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
        System.out.println("Printing even numbers-----------");
        list.stream().forEach(System.out::println);

        Student student1 = new Student(4, "rahul", "2");
        Student student2 = new Student(1, "ravi", "100");
        Student student3 = new Student(2, "chandra", "1300");
        Student student4 = new Student(6, "chaman", "10");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.stream().sorted(Comparator.comparing(Student::getId)).map(Student::getName).collect(Collectors.toList()).stream().forEach(System.out::println);

        String s = "aabbccc";

        Map<String, Long> cMap  = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        cMap.entrySet().stream().forEach(System.out::println);


        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Pineapple");
        fruits.add("Apple");

        Map<String, Integer> fruitsMap =  fruits.stream().collect(Collectors.toMap(Function.identity(),String::length, (e1,e2)-> e1, HashMap::new));
        fruitsMap.entrySet().stream().forEach(e-> System.out.println(" Key "+e.getKey() +" Value "+e.getValue()));



    }




}
