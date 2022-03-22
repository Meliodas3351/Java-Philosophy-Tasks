package polymorphism.shapes;

import javax.swing.*;
import java.util.Random;

public class Service {
    private static final int COUNT_OF_SHAPES = 4;
    private static Random rnd = new Random();

    public static Shape createRandomShape() {
        int k = rnd.nextInt(COUNT_OF_SHAPES);
        switch (k) {
            case 0: {
                return new Circle();
            }
            case 1: {
                return new Ellipse();
            }
            case 2: {
                return new Square();
            }
            case 3: {
                return new Triangle();
            }
            default: {
                return null;
            }

        }
    }

    public static void draw(Shape shape) {
        shape.draw();
    }

    public static void erase(Shape shape) {
        shape.erase();
    }
}
