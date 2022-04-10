package interfaces.cycleFactory;

public class Unicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println(this + " ride().");
    }

    @Override
    public void balance() {
        System.out.println(this + " balance()");
    }

    @Override
    public String toString() {
        return "Unicycle";
    }
}
