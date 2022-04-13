package innerClasses.sequence;

public interface Selector {
    boolean isArrayFull();

    Object current();

    void next();
}
