package interfaces.interfaceRodent;

public class Chipmunk implements Rodent {
    public Chipmunk() {
        System.out.println("Chipmunk");
    }

    @Override
    public String toString() {
        return "Chipmunk";
    }

    @Override
    public void eatGrain() {
        System.out.println(this + "eats Grain");
    }
}
