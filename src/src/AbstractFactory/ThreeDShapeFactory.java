package AbstractFactory;

/**
 * Concrete factory
 */
public class ThreeDShapeFactory extends AbstractFactory {
    @Override
    GeometricShape getShape(ShapeType name) {
        if (ShapeType.SPHERE == name) {
            return new Sphere();
        } else if (ShapeType.TRAPEZOID == name) {
            return new Trapezoid();
        }
        return null;
    }
}