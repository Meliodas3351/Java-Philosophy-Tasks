package interfaces.coinDiceGame;

public interface Game {
    int COUNT_OF_GAME_MOVES = 10;

    void startGame();

    void makeGameMove();

    void endGame();
}
