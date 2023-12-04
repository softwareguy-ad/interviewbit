package corejava;

import bean.Student;

public class HashCodeEquals {
    public static void main(String[] args) {
        Student rahul = new Student(1, "rahul", "100");
        Student macha = new Student(1, "rahul", "100");

        if(rahul.equals(macha)){
            System.out.println("both are equal");
        }
        else {
            System.out.println("both are not equal");
        }
    }
}
