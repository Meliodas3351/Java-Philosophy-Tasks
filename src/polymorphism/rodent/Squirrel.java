package polymorphism.rodent;

public class Squirrel extends Rodent {
    @Override
    public String toString() {
        return "Squirrel";
    }

    @Override
    public void eatGrain() {
        super.eatGrain();
    }
}
