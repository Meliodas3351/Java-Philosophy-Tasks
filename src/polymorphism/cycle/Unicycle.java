package polymorphism.cycle;

public class Unicycle extends Cycle {
    Unicycle() {
        countOfWheels = 1;
    }

    @Override
    public void ride() {
        System.out.println("Unicycle ride()");
        wheels();
    }

    public void balance() {
        System.out.println(this + " balance()");
    }
}
