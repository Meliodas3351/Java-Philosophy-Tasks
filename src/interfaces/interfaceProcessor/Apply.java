package interfaces.interfaceProcessor;

public class Apply {
    public static void process(StringProcessor stringProcessor, Object o) {
        System.out.println(stringProcessor.process(o));
    }
}
