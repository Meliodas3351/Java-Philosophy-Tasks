package interfaces.abstractRodent;

public class Hamster extends Rodent {
    //private Hamster hamster = new Hamster();
    //private  Meerkat meerkat = new Meerkat();\

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
        eatGrain();
    }
}
