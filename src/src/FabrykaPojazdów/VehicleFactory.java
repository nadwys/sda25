package FabrykaPojazdów;

public abstract class VehicleFactory {
    public static Vehicle getVehicle(VehicleType name) {
        Vehicle vehicle = null;
        switch (name){
            case CAR:
                vehicle = new Car();
                break;
            case QUAD:
                vehicle = new Quad();
                break;
            case MOTORCYCLE:
                vehicle = new Motorcycle();
                break;
        }
        return vehicle;
    }
}
