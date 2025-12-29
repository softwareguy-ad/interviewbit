package json;

public class JsonMapper {


    public static void main(String[] args) {
        Student.Address address = new Student.Address(12, "Bangalore", "Karnataka");
        Student s = new Student("Aksahay", 23, address);
    }
}
