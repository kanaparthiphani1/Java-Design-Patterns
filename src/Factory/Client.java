package Factory;

public class Client {
    public static void main(String[] args) {

    Vehicle v = VehicleFactory.getVehicle("bike");
    v.drive();
    }
}
