package FabrykaPojazdów;

public class CarFactory extends AbstractFactory {
    @Override
    Vehicle getVehicle(VehicleType vehicleType) {
        return new Car();
    }
}