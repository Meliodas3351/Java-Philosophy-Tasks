package exceptions.start_tasks;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        try {
            int index = 0;
            while (true) {
                System.out.println(numbers[index++]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(System.out);
        }
    }
}
