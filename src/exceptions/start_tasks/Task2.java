package exceptions.start_tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = null;
        try {
            task2.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println("Method");
    }
}
