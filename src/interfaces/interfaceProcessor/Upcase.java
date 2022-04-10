package interfaces.interfaceProcessor;

import java.util.Locale;

public class Upcase extends StringProcessor {

    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}
