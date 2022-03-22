package polymorphism.rodent;

public class Rodent {
    @Override
    public String toString() {
        return "Rodent";
    }

    public void eatGrain() {
        System.out.println(toString() + " is eating the grain.");
    }
}
