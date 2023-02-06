package exceptions.start_tasks;

public class Task28 {
    public static void main(String[] args) {
        throw new ExceptionFor28Task();
    }
}

class ExceptionFor28Task extends RuntimeException {
    public ExceptionFor28Task() {
    }

    public ExceptionFor28Task(String message) {
        super(message);
    }
}
