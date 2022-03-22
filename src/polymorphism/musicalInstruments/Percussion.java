package polymorphism.musicalInstruments;

public class Percussion extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println(toString() + " play " + note);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting " + toString());
    }
}
