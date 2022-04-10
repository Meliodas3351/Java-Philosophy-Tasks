package interfaces.musicalInstruments;

public class Stringer extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println(this + " play " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting " + this);
    }

    @Override
    public String toString() {
        return "Stringer";
    }
}
