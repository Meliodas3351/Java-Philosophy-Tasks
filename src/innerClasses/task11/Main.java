package innerClasses.task11;

public class Main {
    public static void main(String[] args) {
        Shape shape = new MyClass().getShape(10);
        Shape shape1 = null;
        //shape = (Circle) shape1; - error
    }
}
