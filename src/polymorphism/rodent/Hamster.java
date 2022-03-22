package polymorphism.rodent;

public class Hamster extends Rodent {
    @Override
    public String toString() {
        return "Hamster";
    }

    @Override
    public void eatGrain() {
        super.eatGrain();
    }
}
