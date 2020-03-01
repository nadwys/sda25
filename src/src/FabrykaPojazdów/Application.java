package FabrykaPojazdów;

import static AbstractFactory.FactoryType.TWO_D_SHAPE_FACTORY;

public class Application{
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProvider.getFactory(FactoryType.CAR_FACTORY);
        Vehicle vehicle = factory.getVehicle(VehicleType.CAR);
        vehicle.drive();
    }
}