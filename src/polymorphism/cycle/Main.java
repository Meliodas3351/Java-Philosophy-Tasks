package polymorphism.cycle;

public class Main {
    public static void main(String[] args) {
        Service.ride(new Cycle());
        Service.ride(new Unicycle());
        Service.ride(new Bicycle());
        Service.ride(new Tricycle());
    }
}
