package scanner;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Info info = new Info("124   ! 1111 ! 1,89! 1,06  ! srerere");
        try {
            Class.forName("Info");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }

    }
}

class Info {
    private int anInt;
    private long aLong;
    private float aFloat;
    private double aDouble;
    private String string;

    public Info(String string) {
        Scanner scanner = new Scanner(string);
        scanner.useDelimiter("\\s*!\\s*");
        this.anInt = scanner.nextInt();
        System.out.println(this.anInt);
        this.aLong = scanner.nextLong();
        System.out.println(this.aLong);
        this.aFloat = scanner.nextFloat();
        System.out.println(this.aFloat);
        this.aDouble = scanner.nextDouble();
        System.out.println(this.aDouble);
        this.string = scanner.next();
        System.out.println(this.string);
    }

    @Override
    public String toString() {
        return "Info {" +
                "anInt=" + anInt +
                "\naLong=" + aLong +
                "\naFloat=" + aFloat +
                "\naDouble=" + aDouble +
                "\nstring='" + string + '\'' +
                "\n}";
    }
}

