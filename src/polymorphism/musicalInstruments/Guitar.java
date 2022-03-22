package polymorphism.musicalInstruments;

public class Guitar extends Instrument {
    @Override
    public String toString() {
        return "Guitar";
    }

    @Override
    public void play(Note note) {
        System.out.println(toString() + " play " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting " + toString());
    }
}
