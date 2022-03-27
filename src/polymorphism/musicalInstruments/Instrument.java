package polymorphism.musicalInstruments;

public class Instrument {
    public void play(Note note) {
        System.out.println(this + " play " + note);
    }

    public void adjust() {
        System.out.println("Adjusting " + this);
    }

    @Override
    public String toString() {
        return "Instrument";
    }
}
