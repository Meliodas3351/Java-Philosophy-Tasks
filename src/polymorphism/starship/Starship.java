package polymorphism.starship;

public class Starship {
    private AlertStatus alertStatus = RandomStatusGenerator.createRandomStatus();

    public void changeStatus() {
        alertStatus = RandomStatusGenerator.createRandomStatus();
        alertStatus.printStatus();
    }
}
