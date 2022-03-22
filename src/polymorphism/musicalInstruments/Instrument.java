package polymorphism.musicalInstruments;

public class Instrument {
    public void play(Note note) {
        System.out.println(toString() + " play " + note);
    }

    public void adjust() {
        System.out.println("Adjusting " + toString());
    }

    @Override
    public String toString() {
        return "Instrument";
    }
}
