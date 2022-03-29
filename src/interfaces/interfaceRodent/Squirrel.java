package interfaces.interfaceRodent;

public class Squirrel implements Rodent {
    public Squirrel() {
        System.out.println("Squirrel");
    }

    @Override
    public String toString() {
        return "Squirrel";
    }

    @Override
    public void eatGrain() {
        System.out.println(this + "eats Grain");
    }

    @Override
    public void dispose() {

    }
}
