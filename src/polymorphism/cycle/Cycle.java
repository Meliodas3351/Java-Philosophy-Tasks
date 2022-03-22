package polymorphism.cycle;

public class Cycle {
    private static int countOfWheels;

    Cycle() {
        setCountOfWheels(0);
    }

    public void ride() {
        System.out.println("Cycle ride()");
        wheels();
    }

    public void wheels() {
        System.out.println("Wheels - " + getCountOfWheels());
    }

    public static int getCountOfWheels() {
        return countOfWheels;
    }

    public static void setCountOfWheels(int countOfWheels) {
        Cycle.countOfWheels = countOfWheels;
    }
}
