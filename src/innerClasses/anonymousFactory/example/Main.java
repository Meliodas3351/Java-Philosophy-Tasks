package innerClasses.anonymousFactory.example;

public class Main {
    public static void playGame(GameFactory gameFactory) {
        Game game = gameFactory.getGame();
        game.startGame();
        int k = Game.COUNT_OF_GAME_MOVES;
        for (int i = 0; i < k; i++) {
            game.makeGameMove();
        }
        game.endGame();
    }

    public static void main(String[] args) {
        playGame(Coin.returnCoinFactory());
        playGame(Dice.returnDiceFactory());
    }
}
