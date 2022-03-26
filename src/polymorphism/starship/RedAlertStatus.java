package polymorphism.starship;

public class RedAlertStatus extends AlertStatus {
    @Override
    public void printStatus() {
        System.out.println("Status Red");
    }
}
