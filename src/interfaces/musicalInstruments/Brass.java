package interfaces.musicalInstruments;

public class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }

    @Override
    public void play(Note note) {
        System.out.println(this + " play " + note);
    }
}
