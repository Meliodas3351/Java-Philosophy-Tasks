package interfaces.cycleFactory;

public class Main {
    public static void useCycle(CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();
        cycle.balance();
        cycle.ride();
    }

    public static void main(String[] args) {
        useCycle(new UnicycleFactory());
        useCycle(new BicycleFactory());
        useCycle(new TricycleFactory());
    }
}
