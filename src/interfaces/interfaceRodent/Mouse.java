package interfaces.interfaceRodent;

public class Mouse implements Rodent {
    public Mouse() {
        System.out.println("Mouse");
    }

    @Override
    public String toString() {
        return "Mouse";
    }

    @Override
    public void eatGrain() {
        System.out.println(this + "eats Grain");
    }

    @Override
    public void dispose() {

    }
}
