package polymorphism.musicalInstruments;

public class Stringer extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println(toString() + " play " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting " + toString());
    }

    @Override
    public String toString() {
        return "Stringer";
    }
}
