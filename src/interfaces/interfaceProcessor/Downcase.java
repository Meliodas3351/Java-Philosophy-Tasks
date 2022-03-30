package interfaces.interfaceProcessor;

import java.util.Locale;

public class Downcase extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}
