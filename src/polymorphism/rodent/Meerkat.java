package polymorphism.rodent;

public class Meerkat extends Rodent {
    public Meerkat(Nut nut) {
        super(nut);
        System.out.println("Meerkat");
    }

    @Override
    public String toString() {
        return "Meerkat";
    }

    @Override
    public void eatGrain() {
        super.eatGrain();
    }
}
