package interfaces.cycleFactory;

public class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
