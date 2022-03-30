package interfaces.musicalInstruments;

public class Percussion extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println(this + " play " + note);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting " + this);
    }
}
