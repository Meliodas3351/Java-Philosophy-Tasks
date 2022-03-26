package polymorphism.starship;

import java.util.Random;

public class RandomStatusCreator {
    private static final Random random = new Random();
    private static final int COUNT_OF_STATUSES = 3;

    public static AlertStatus createRandomStatus() {
        int k = random.nextInt(COUNT_OF_STATUSES);
        switch (k) {
            case 0: {
                return new GrayAlertStatus();
            }
            case 1: {
                return new RedAlertStatus();
            }
            case 2: {
                return new YellowAlertStatus();
            }
            default: {
                return null;
            }
        }
    }
}
