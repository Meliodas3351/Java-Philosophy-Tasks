package strings.stringFormat;

public class StringFormat {
    private int anInt;
    private long aLong;
    private float aFloat;
    private double aDouble;

    public StringFormat(int anInt, long aLong, float aFloat, double aDouble) {
        this.anInt = anInt;
        this.aLong = aLong;
        this.aFloat = aFloat;
        this.aDouble = aDouble;
    }

    @Override
    public String toString() {
        return String.format("Int - %d\nLong - %d\nFloat - %f\nDouble - %f\n", anInt, aLong, aFloat, aDouble);
    }

    public static void main(String[] args) {
        StringFormat stringFormat = new StringFormat(12,12,1.2f,5.5d);
        System.out.println(stringFormat);
    }
}
