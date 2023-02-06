package exceptions.start_tasks;

public class Task21 {
    public static void main(String[] args) {
        Inner inner = new Inner();
    }
}

class Inner extends Outer {
    public Inner() {
        super();

    }
}

class Outer {
    public Outer() {
        try {
            throw new NumberFormatException();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
