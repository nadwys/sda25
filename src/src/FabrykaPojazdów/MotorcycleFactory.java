package FabrykaPojazdów;

public class MotorcycleFactory extends AbstractFactory {
    @Override
    Vehicle getVehicle(VehicleType vehicleType) {
        return new Motorcycle();
    }
}
