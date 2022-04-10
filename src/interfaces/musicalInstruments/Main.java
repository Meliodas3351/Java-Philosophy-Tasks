package interfaces.musicalInstruments;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[15];
        for (Instrument instrument : instruments) {
            instrument = Service.createRandomInstrument();
            Service.adjustInstrument(instrument);
            Service.playInstrument(instrument, Service.createRandomNote());
            System.out.println(instrument);
            System.out.println();
        }
    }
}
