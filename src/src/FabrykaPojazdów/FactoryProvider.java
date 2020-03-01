package FabrykaPojazdów;

public class FactoryProvider {

    public static AbstractFactory getFactory(FactoryType factoryType) {
        if (FactoryType.CAR_FACTORY == factoryType) {
            return new CarFactory();
        } else if (FactoryType.MOTORCYCLE_FACTORY == factoryType) {
            return new MotorcycleFactory();
        } else if (FactoryType.QUAD_FACTORY == factoryType) {
            return new QuadFactory();
        }
        return null;
    }
}