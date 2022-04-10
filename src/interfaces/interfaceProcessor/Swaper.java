package interfaces.interfaceProcessor;

public class Swaper extends StringProcessor {
    @Override
    public String process(Object input) {
        String result = "";
        String arg = (String) input;
        for (int k = 0; k < arg.length() / 2; k++) {
            result += arg.charAt(2 * k + 1);
            result += arg.charAt(2 * k);
        }
        return result;
    }
}
