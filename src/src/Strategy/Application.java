package Strategy;

public class Application {
    public static void main(String[] args) {
        String operation = "+";
        int x = 10;
        int y = 15;

        if("+".equals(operation)){
            Add add = new Add();
            add.calculate(x,y);
        } else if ("*".equals(operation)) {
            Multiply multiply = new Multiply();
            multiply.calculate(x,y);
        }
    }
}
