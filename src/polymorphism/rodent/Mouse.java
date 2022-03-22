package polymorphism.rodent;

public class Mouse extends Rodent {
    @Override
    public String toString() {
        return "Mouse";
    }

    @Override
    public void eatGrain() {
        super.eatGrain();
    }
}
