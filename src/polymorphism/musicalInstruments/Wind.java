package polymorphism.musicalInstruments;

public class Wind extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println(toString() + " play " + note);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting " + toString());
    }
}
