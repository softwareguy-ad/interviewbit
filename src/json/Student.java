package json;

public class Student {
    private String name;
    private int id;
    private Address address;

    public Student() {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(String name, int id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    static class Address{
        private int flatno;

        private String city;

        private String state;

        public int getFlatno() {
            return flatno;
        }

        public void setFlatno(int flatno) {
            this.flatno = flatno;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Address(int flatno, String city, String state) {
            this.flatno = flatno;
            this.city = city;
            this.state = state;
        }
    }

}
