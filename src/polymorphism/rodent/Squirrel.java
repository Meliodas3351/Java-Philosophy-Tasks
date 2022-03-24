package polymorphism.rodent;

public class Squirrel extends Rodent {
    public Squirrel(Nut nut) {
        super(nut);
        System.out.println("Squirrel");
    }

    @Override
    public String toString() {
        return "Squirrel";
    }

    @Override
    public void eatGrain() {
        super.eatGrain();
    }
}
