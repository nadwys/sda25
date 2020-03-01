package AbstractFactory;

/**
 * Concrete product
 */
public class Sphere implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Sphere drawn.");
    }

    @Override
    public void calculateArea() {
        System.out.println("Sphere area 20");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Sphere perimeter 20");

    }
}