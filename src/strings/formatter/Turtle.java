package strings.formatter;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {
    private String name;
    private Formatter f;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s Turtle is at %d,%d\n", name, x, y);
    }

    public static void main(String[] args) {
        Turtle turtle = new Turtle("Garry", new Formatter(System.err));
        PrintStream printStream = System.err;
        Turtle turtle1 = new Turtle("Barry",new Formatter(printStream));

        turtle.move(5,5);
        turtle1.move(6,6);
    }
}
