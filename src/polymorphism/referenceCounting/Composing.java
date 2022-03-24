package polymorphism.referenceCounting;

public class Composing {
    private Shared shared;
    private int refcount = 0;
    private static long count = 0;
    private final long id = count++;

    public Composing(Shared shared) {
        this.shared = shared;
        this.shared.addRef();
        System.out.println("Create " + toString());
    }

    public void addRef() {
        this.refcount++;
    }

    public void dispose() throws Throwable {
        this.shared.dispose();
        System.out.println("Dispose " + this);
        this.finalize();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(toString() + " finalize");
        super.finalize();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }


}
