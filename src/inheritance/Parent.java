package inheritance;

public class Parent {
    String name;

    public Parent() {
        System.out.println("Parent Default");
    }

    public Parent(String name) {
        System.out.println("Parent parameterized : " + name);
        this.name = name;
    }
}
