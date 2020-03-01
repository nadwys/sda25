package AbstractFactory;

/**
 * Concrete product
 */
public class Trapezoid implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Trapezoid is drawn.");
    }

    @Override
    public void calculateArea() {
        System.out.println("Trapezoid area 20");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Trapezoid perimeter 20");
    }
}