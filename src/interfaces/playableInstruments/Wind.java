package interfaces.playableInstruments;

public class Wind extends Instrument implements Playable {
    @Override
    public void adjust() {
        System.out.println(this + " adjusting");
    }

    @Override
    public void play(Note note) {
        System.out.println(this + " plays " + note);
    }

    @Override
    public String toString() {
        return "Wind";
    }
}
