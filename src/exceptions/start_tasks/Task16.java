package exceptions.start_tasks;

public class Task16 {
    public static void main(String[] args) {
        try {
            System.out.println("Try body");
            return;
        }finally {
            System.out.println("Final body");
        }
    }
}
