package interfaces.abstractRodent;

import java.util.Random;

public class Service {
    private static final int COUNT_OF_RODENTS = 5;
    private static Random rnd = new Random();

    public static void eatGrain(Rodent rodent) {
        rodent.eatGrain();
    }

    public static Rodent createRandomRodent(Nut nut) {
        int k = rnd.nextInt(COUNT_OF_RODENTS);
        switch (k) {
            case 0: {
                return new Chipmunk(nut);
            }
            case 1: {
                return new Hamster(nut);
            }
            case 2: {
                return new Meerkat(nut);
            }
            case 3: {
                return new Mouse(nut);
            }
            case 4: {
                return new Squirrel(nut);
            }
            default: {
                return null;
            }
        }
    }
}
