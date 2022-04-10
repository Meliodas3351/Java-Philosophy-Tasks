package interfaces.interfaceRodent;

public class Meerkat implements Rodent {
    public Meerkat() {
        System.out.println("Meerkat");
    }

    @Override
    public String toString() {
        return "Meerkat";
    }

    @Override
    public void eatGrain() {
        System.out.println(this + "eats Grain");
    }
}
