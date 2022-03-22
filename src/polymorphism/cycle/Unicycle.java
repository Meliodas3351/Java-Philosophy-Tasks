package polymorphism.cycle;

public class Unicycle extends Cycle {
    Unicycle() {
        setCountOfWheels(1);
    }

    @Override
    public void ride() {
        System.out.println("Unicycle ride()");
        wheels();
    }
}
