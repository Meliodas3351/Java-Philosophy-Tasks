package polymorphism.glyph;

public class RoundGlyph extends Glyph {
    private int radius;

    @Override
    public void draw() {
        System.out.println("RoundGlyph draw(); radius " + this.radius);
    }

    RoundGlyph(int r) {
        this.radius = r;
        draw();
    }
}
