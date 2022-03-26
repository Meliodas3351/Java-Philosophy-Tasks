package polymorphism.glyph;

public class RectangularGlyph extends Glyph {
    private int height;
    private int width;

    public RectangularGlyph(int h, int w) {
        this.height = h;
        this.width = w;
        draw();
    }

    @Override
    public void draw() {
        System.out.println("RectangularGlyph draw(); height - " + this.height + ", width - " + width);
    }
}
