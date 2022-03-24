package polymorphism.rodent;

public class Hamster extends Rodent {

    public Hamster(Nut nut) {
        super(nut);
        System.out.println("Hamster");
    }

    @Override
    public String toString() {
        return "Hamster";
    }

    @Override
    public void eatGrain() {
        super.eatGrain();
    }
}
