package interfaces.musicalInstruments;

public class Wind extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println(this + " play " + note);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting " + this);
    }
}
