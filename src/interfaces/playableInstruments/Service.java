package interfaces.playableInstruments;

import interfaces.musicalInstruments.Guitar;
import interfaces.musicalInstruments.Instrument;
import interfaces.musicalInstruments.Note;
import interfaces.musicalInstruments.Percussion;
import interfaces.musicalInstruments.Wind;
import interfaces.musicalInstruments.*;

import java.util.Random;

public class Service {
    private static Random rnd = new Random();
    private static final int COUNT_OF_INSTRUMENTS = 6;
    private static final int COUNT_OF_NOTES = 7;

    public static interfaces.musicalInstruments.Instrument createRandomInstrument() {
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

    public static void adjustInstrument(interfaces.musicalInstruments.Instrument instrument) {
        instrument.adjust();
    }

    public static void playInstrument(Instrument instrument, interfaces.musicalInstruments.Note note) {
        instrument.play(note);
    }

    public static interfaces.musicalInstruments.Note createRandomNote() {
        int k = rnd.nextInt(COUNT_OF_NOTES);
        switch (k) {
            case 0: {
                return interfaces.musicalInstruments.Note.BREVE;
            }
            case 1: {
                return interfaces.musicalInstruments.Note.CROTCHET;
            }
            case 2: {
                return interfaces.musicalInstruments.Note.MINIM;
            }
            case 3: {
                return interfaces.musicalInstruments.Note.QUARER;
            }
            case 4: {
                return interfaces.musicalInstruments.Note.DEMISEMIQUARER;
            }
            case 5: {
                return interfaces.musicalInstruments.Note.SEMIBREVE;
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
