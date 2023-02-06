package exceptions.start_tasks;

public class Task4 {
    public static void main(String[] args) {
        try {
            throw new MyException("Created in main()");
        } catch (MyException e) {
            e.printStackTrace();
            //System.out.println(e);
        }
    }
}

class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
