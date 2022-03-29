package interfaces.downConversion;

public class Service {
    public static void doDownConversion(MyAbstractClass myAbstractClass) {
        myAbstractClass = new DaughterClass();
        ((DaughterClass) myAbstractClass).printSuccess();
    }
}
