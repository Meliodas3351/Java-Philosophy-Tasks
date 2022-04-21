package innerClasses.anonymousСlasses;

public class Car {
    private String model;
    private int mileage;

    public Car(String model, int mileage) {
        this.model = model;
        this.mileage = mileage;
        System.out.println("Car constructor.\n" + this);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car - " +
                "model='" + model + '\'' +
                ", mileage=" + mileage;
    }
}
