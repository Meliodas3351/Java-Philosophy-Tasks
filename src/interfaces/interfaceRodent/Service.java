package interfaces.interfaceRodent;

import java.util.Random;

public class Service {
    private static final int COUNT_OF_RODENTS = 5;
    private static Random rnd = new Random();

    public static void eatGrain(Rodent rodent) {
        rodent.eatGrain();
    }

    public static Rodent createRandomRodent() {
        int k = rnd.nextInt(COUNT_OF_RODENTS);
        switch (k) {
            case 0: {
                return new Chipmunk();
            }
            case 1: {
                return new Hamster();
            }
            case 2: {
                return new Meerkat();
            }
            case 3: {
                return new Mouse();
            }
            case 4: {
                return new Squirrel();
            }
            default: {
                return null;
            }
        }
    }
}
