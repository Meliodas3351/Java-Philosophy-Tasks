package polymorphism.starship;

public class YellowAlertStatus extends AlertStatus {
    @Override
    public void printStatus() {
        System.out.println("Status Yellow");
    }
}
