package interfaces.abstractRodent;

public class Mouse extends Rodent {
    public Mouse(Nut nut) {
        super(nut);
        System.out.println("Mouse");
    }

    @Override
    public String toString() {
        return "Mouse";
    }

    @Override
    public void eatGrain() {
        eatGrain();
    }
}
