package interfaces.multipleImplementation;

public class Hero extends ActionCharacter implements CanClimb, CanFight, CanFly, CanSwim {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    @Override
    public void fight() {
        System.out.println(this + " fight()");
    }

    @Override
    public void climb() {
        System.out.println(this + " climb()");
    }

    @Override
    public void fly() {
        System.out.println(this + " fly()");
    }

    @Override
    public void swim() {
        System.out.println(this + " swim()");
    }

    @Override
    public String toString() {
        return name;
    }
}
