package polymorphism.shapes;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        for (Shape shape : shapes) {
            shape = Service.createRandomShape();
            shape.draw();
            shape.erase();
            shape.paintUp();
            System.out.println();
        }
    }
}
