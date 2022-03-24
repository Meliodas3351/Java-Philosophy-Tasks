package polymorphism.sandwich;

public class Sandwich extends PortableLunch {
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();
    private Pickle pickle = new Pickle();

    public Sandwich() {
        System.out.println("Sandwich");
    }
}
