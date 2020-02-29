package Builder;

public class Application {
    public static void main(String[] args) {
    Pizza pizza = new Pizza.PizzaBuilder("składnik", "składnik", "składnik")
            .setCzyBiała(true).build();
        System.out.println(pizza);
    }
}
