package AbstractFactory;

/**
 * Concrete Product
 */
public class Line implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Line Drawn.");
    }

    @Override
    public void calculateArea() {
        System.out.println("Line area 0");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Line perimeter 0");
    }

}