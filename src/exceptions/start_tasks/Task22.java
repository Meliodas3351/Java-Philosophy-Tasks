package exceptions.start_tasks;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        try {
            FailingConstructor failingConstructor = new FailingConstructor();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}

class FailingConstructor {
    private int number;

    public FailingConstructor() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        this.number = Integer.parseInt(scanner.nextLine());
    }
}


