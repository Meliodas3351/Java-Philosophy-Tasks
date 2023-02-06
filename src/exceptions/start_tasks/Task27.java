package exceptions.start_tasks;

public class Task27 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        try {
            try {
                int index = 0;
                while (true) {
                    System.out.println(numbers[index++]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new RuntimeException(e);
            }
        } catch (RuntimeException e){
            e.printStackTrace();
            e.getCause().printStackTrace();
        }

    }
}
