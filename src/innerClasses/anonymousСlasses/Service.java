package innerClasses.anonymousСlasses;

public class Service {
    public static Car createCar(String model, int mileage) {
        return new Car(model, mileage) {
            {
                System.out.println("Anonymous class constructor");
            }
        };
    }

    public static void main(String[] args) {
        Car car = createCar("Tesla", 1500);
    }
}
