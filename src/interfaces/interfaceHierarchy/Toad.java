package interfaces.interfaceHierarchy;

public class Toad implements Reptile {
    private String name;

    public Toad(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(getName() + " run.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " move.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swim.");
    }
}
