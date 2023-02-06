package exceptions.start_tasks;

public class Task1 {
    public static void main(String[] args) {
        try {
            throw new Exception("Created in main()");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            System.out.println("End");
        }
    }
}
