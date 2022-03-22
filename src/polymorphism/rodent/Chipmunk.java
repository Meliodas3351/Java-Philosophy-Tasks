package polymorphism.rodent;

public class Chipmunk extends Rodent {
    @Override
    public String toString() {
        return "Chipmunk";
    }

    @Override
    public void eatGrain() {
        super.eatGrain();
    }
}
