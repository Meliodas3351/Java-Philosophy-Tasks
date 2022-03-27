package polymorphism.cycle;

public class Main {
    public static void main(String[] args) {
        Service.ride(new Cycle());
        Service.ride(new Unicycle());
        Service.ride(new Bicycle());
        Service.ride(new Tricycle());

        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        Cycle[] cycles = new Cycle[]{unicycle, bicycle, tricycle};
        ((Unicycle) cycles[0]).balance();
        ((Bicycle) cycles[1]).balance();
        ((Tricycle) cycles[2]).balance();
    }
}
