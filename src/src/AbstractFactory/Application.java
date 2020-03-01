package AbstractFactory;

import static AbstractFactory.FactoryType.THREE_D_SHAPE_FACTORY;
import static AbstractFactory.FactoryType.TWO_D_SHAPE_FACTORY;

public class Application {
    /**
     * Client
     */
        public static void main(String[] args) {
            //drawing 2D shape
            AbstractFactory factory = FactoryProvider.getFactory(TWO_D_SHAPE_FACTORY);
            if (factory == null) {
                System.out.println("Factory for given name doesn't exist.");
                System.exit(1);
            }
            //getting shape using factory obtained
            GeometricShape shape = factory.getShape(ShapeType.LINE);
            if (shape != null) {
                shape.draw();
            } else {
                System.out.println("Shape with given name doesn't exist.");
            }
            //drawing 3D shape
            factory = FactoryProvider.getFactory(THREE_D_SHAPE_FACTORY);
            if (factory == null) {
                System.out.println("Factory for given name doesn't exist.");
                System.exit(1);
            }
            //getting shape using factory obtained
            shape = factory.getShape(ShapeType.TRAPEZOID);
            if (shape != null) {
                shape.draw();
                shape.calculateArea();
                shape.calculatePerimeter();
            } else {
                System.out.println("Shape with given name doesn't exist.");
            }

        }
    }
