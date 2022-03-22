package polymorphism.rodent;

public class Meerkat extends Rodent {
    @Override
    public String toString() {
        return "Meerkat";
    }

    @Override
    public void eatGrain() {
        super.eatGrain();
    }
}
