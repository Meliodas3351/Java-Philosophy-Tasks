package interfaces.playableInstruments;

import interfaces.musicalInstruments.Instrument;

public class Main {
    public static void main(String[] args) {
        interfaces.musicalInstruments.Instrument[] instruments = new interfaces.musicalInstruments.Instrument[15];
        for (Instrument instrument : instruments) {
            instrument = Service.createRandomInstrument();
            Service.adjustInstrument(instrument);
            Service.playInstrument(instrument, Service.createRandomNote());
            System.out.println(instrument);
            System.out.println();
        }
    }
}
