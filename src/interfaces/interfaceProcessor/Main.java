package interfaces.interfaceProcessor;

public class Main {
    public static void main(String[] args) {
        String myStr = "My STR foR ExpeRImENt!";
        Apply.process(new Downcase(), myStr);
        Apply.process(new Upcase(), myStr);
        Apply.process(new Splitter(), myStr);
        Apply.process(new Swaper(), myStr);
    }
}
