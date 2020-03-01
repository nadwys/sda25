package AbstractFactory;

/**
 * Concrete product
 */
public class Triangle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Triangle is drawn.");
    }

    @Override
    public void calculateArea() {
        System.out.println("Triangle area 15");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Triangle perimeter 20");
    }
}