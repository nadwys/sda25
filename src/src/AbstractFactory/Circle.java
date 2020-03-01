package AbstractFactory;

/**
 * Concrete product
 */
public class Circle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Circle is drawn.");
    }
@Override
public void calculateArea(){
    System.out.println("Circle area 20");
}
    @Override
    public void calculatePerimeter() {
        System.out.println("Circle perimeter 20");
    }
}