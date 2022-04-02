package interfaces.coinDiceGame;

import java.util.Random;

public class GameResultGenerator {
    private static Random rnd = new Random();

    private static final int COUNT_OF_COIN_VARIATIONS = 2;
    private static final int COUNT_OF_DICE_VARIATIONS = 6;

    public static String generateCoinResult() {
        int k = rnd.nextInt(COUNT_OF_COIN_VARIATIONS);
        switch (k) {
            case 0:
                return "Heads";

            case 1:
                return "Tails";

            default:
                return null;
        }
    }

    public static String generateDiceResult() {
        int k = rnd.nextInt(COUNT_OF_DICE_VARIATIONS);
        return Integer.toString(k + 1);
    }
}
