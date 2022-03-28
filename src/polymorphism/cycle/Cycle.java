package polymorphism.cycle;

public class Cycle {
    protected static int countOfWheels = 0;

    Cycle() {

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
