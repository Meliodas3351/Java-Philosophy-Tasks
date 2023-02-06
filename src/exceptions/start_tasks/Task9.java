package exceptions.start_tasks;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            int input = Integer.parseInt(scanner.nextLine());
            switch (input){
                case 1:{
                    throw new ExceptionFirst();
                }
                case 2: {
                    throw new ExceptionSecond();
                }
                case 3:{
                    throw new ExceptionThird();
                }
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}

class ExceptionFirst extends Exception {
    public ExceptionFirst() {
    }

    public ExceptionFirst(String message) {
        super(message);
    }
}

class ExceptionSecond extends Exception {
    public ExceptionSecond() {
    }

    public ExceptionSecond(String message) {
        super(message);
    }
}

class ExceptionThird extends Exception {
    public ExceptionThird() {
    }

    public ExceptionThird(String message) {
        super(message);
    }
}
