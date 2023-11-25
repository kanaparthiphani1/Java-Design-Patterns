package Factory;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        switch (type){
            case "bike":
                return new Bike();
            case "bus":
                return new Bus();
            default:
                return null;
        }
    }
}
