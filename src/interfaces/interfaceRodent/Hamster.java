package interfaces.interfaceRodent;

public class Hamster implements Rodent {
    public Hamster() {
        System.out.println("Hamster");
    }

    @Override
    public String toString() {
        return "Hamster";
    }

    @Override
    public void eatGrain() {
        System.out.println(this + "eats Grain");
    }
}
