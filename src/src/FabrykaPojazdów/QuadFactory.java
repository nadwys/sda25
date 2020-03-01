package FabrykaPojazdów;

public class QuadFactory extends AbstractFactory {
    @Override
    Vehicle getVehicle(VehicleType vehicleType) {
        return new Quad();
    }
}