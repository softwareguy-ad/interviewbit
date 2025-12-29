package abstraction;

public class Swift extends Vehicle{
    @Override
    void price() {
        System.out.println("price is 10L");
    }

    public static void main(String[] args) {
        Swift obj = new Swift();
        obj.setVehicleType("4 Wheeler");
        obj.price();
        System.out.println("Vehicle type = "+obj.getVehicleType());
    }
}
