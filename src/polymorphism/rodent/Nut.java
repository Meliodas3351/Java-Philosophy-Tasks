package polymorphism.rodent;

public class Nut {
    private int refcount = 0;
    private static int count = 0;
    private final int id = count++;

    public void addRef() {
        refcount++;
    }

    public void dispose() throws Throwable {
        if (--refcount == 0) {
            finalize();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(toString() + " finalize");
        super.finalize();
    }

    @Override
    public String toString() {
        return "Nut";
    }
}
