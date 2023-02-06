package exceptions.start_tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number - ");
            try {
                int num = Integer.parseInt(scanner.nextLine());
                System.out.println("End");
                return;
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }

    }
}
