package polymorphism.rodent;

public class Rodent {
    private Nut nut;
    public Rodent(Nut nut) {
        this.nut = nut;
        this.nut.addRef();
        System.out.println("Rodent");
    }

    @Override
    public String toString() {
        return "Rodent";
    }

    public void eatGrain() {
        System.out.println(toString() + " is eating the grain.");
    }

    public void dispose() throws Throwable {
        this.nut.dispose();
        this.finalize();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(toString()+" finalize");
        super.finalize();
    }
}
