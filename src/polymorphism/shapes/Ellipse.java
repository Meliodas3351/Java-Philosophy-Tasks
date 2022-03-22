package polymorphism.shapes;

public class Ellipse extends Shape {
    @Override
    public void draw() {
        System.out.println("Ellipse draw()");
    }

    @Override
    public void erase() {
        System.out.println("Ellipse erase()");
    }

    @Override
    public void paintUp() {
        System.out.println("Ellipse painted up");
    }
}
