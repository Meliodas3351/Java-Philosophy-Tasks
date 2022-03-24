package polymorphism.referenceCounting;

public class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    private char[] chars = new char[1000];

    public Shared() {
        System.out.println("Create " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() throws Throwable {
        if (--refcount == 0) {
            this.finalize();
            System.out.println("Dispose " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(toString() + " finalize");
        super.finalize();
    }
}
