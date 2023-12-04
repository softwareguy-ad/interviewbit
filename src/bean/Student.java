package bean;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private String marks;

    public Student(int id, String name, String marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Obj value="+obj+" this obj ="+this);
        if(obj == null || obj.getClass() != Student.class)
            return false;
        Student stuObj = (Student) obj;
        return stuObj.id == this.id && stuObj.marks == this.marks && stuObj.name == this.name;
    }

    @Override
    public int hashCode() {
        System.out.println("returning this hashcode" + id);
        return this.id;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
}
