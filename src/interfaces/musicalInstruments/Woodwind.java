package interfaces.musicalInstruments;

public class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }

    @Override
    public void play(Note note) {
        System.out.println(this + " play " + note);
    }
}
