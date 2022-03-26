package polymorphism.starship;

public class Starship {
    private AlertStatus alertStatus = RandomStatusCreator.createRandomStatus();

    public void changeStatus(){
        alertStatus = RandomStatusCreator.createRandomStatus();
        alertStatus.printStatus();
    }
}
