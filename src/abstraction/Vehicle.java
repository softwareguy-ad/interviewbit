package abstraction;

public abstract class Vehicle {

    abstract void price();

    private String vehicleType;

    public Vehicle() {
        System.out.println("vehicle class default constructor");
    }

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public static void main(String[] args) {
        System.out.println("print this method");
    }
}
