package polymorphism.cycle;

public class Tricycle extends Cycle {
    Tricycle() {
        countOfWheels = 3;
    }

    @Override
    public void ride() {
        System.out.println("Tricycle ride()");
        wheels();
    }

    public void balance() {
        System.out.println(this + " balance()");
    }
}
