package polymorphism.glyph;

public class Glyph {
    public Glyph() {
        System.out.println("До вызова draw()");
        draw();
        System.out.println("После вызова draw()");
    }

    public void draw() {
        System.out.println("Glyph draw()");
    }
}
