package interfaces.abstractRodent;

public class Chipmunk extends Rodent {
    //private Hamster hamster = new Hamster();
    //private  Meerkat meerkat = new Meerkat();

    public Chipmunk(Nut nut) {
        super(nut);
        System.out.println("Chipmunk");
    }

    @Override
    public String toString() {
        return "Chipmunk";
    }

    @Override
    public void eatGrain() {
        eatGrain();
    }
}
