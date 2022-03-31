package interfaces.multipleImplementation;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Superman");
        hero.climb();
        hero.fight();
        hero.swim();
        hero.fly();
    }
}
