package interfaces.musicalInstruments;

import java.util.Random;

public class Service {
    private static Random rnd = new Random();
    private static final int COUNT_OF_INSTRUMENTS = 6;
    private static final int COUNT_OF_NOTES = 7;

    public static Instrument createRandomInstrument() {
        int k = rnd.nextInt(COUNT_OF_INSTRUMENTS);
        switch (k) {
            case 0: {
                return new Brass();
            }
            case 1: {
                return new Percussion();
            }
            case 2: {
                return new Stringer();
            }
            case 3: {
                return new Wind();
            }
            case 4: {
                return new Woodwind();
            }
            case 5: {
                return new Guitar();
            }
            default: {
                return null;
            }
        }
    }

    public static void adjustInstrument(Instrument instrument) {
        instrument.adjust();
    }

    public static void playInstrument(Instrument instrument, Note note) {
        instrument.play(note);
    }

    public static Note createRandomNote() {
        int k = rnd.nextInt(COUNT_OF_NOTES);
        switch (k) {
            case 0: {
                return Note.BREVE;
            }
            case 1: {
                return Note.CROTCHET;
            }
            case 2: {
                return Note.MINIM;
            }
            case 3: {
                return Note.QUARER;
            }
            case 4: {
                return Note.DEMISEMIQUARER;
            }
            case 5: {
                return Note.SEMIBREVE;
            }
            case 6: {
                return Note.SEMIQUARER;
            }
            default: {
                return null;
            }
        }
    }
}
