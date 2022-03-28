package polymorphism.cycle;

public class Bicycle extends Cycle {


    Bicycle() {
        countOfWheels = 2;
    }

    @Override
    public void ride() {
        System.out.println("Bicycle ride()");
        wheels();
    }

    public void balance() {
        System.out.println(this + " balance()");
    }
}
