package polymorphism.shapes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        //Shape[] shapes = new Shape[10];
        ArrayList<Shape> shapes = new RandomShapesGenerator(10).createShapes();

        for (Shape shape : shapes) {
            shape = Service.createRandomShape();
            shape.draw();
            shape.erase();
            shape.paintUp();
            System.out.println();
        }
    }
}

class RandomShapesGenerator {
    private int count;

    public RandomShapesGenerator(int count) {
        this.count = count;
    }

    public ArrayList<Shape> createShapes(){
        ArrayList<Shape> shapes = new ArrayList<>();
        ListIterator<Shape> iterator = shapes.listIterator();
        int index = 0;
        while(index<count){
            iterator.add(Service.createRandomShape());
            index++;
        }
        return shapes;
    }
}
