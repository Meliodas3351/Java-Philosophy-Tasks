package interfaces.coinDiceGame;

public class CoinFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Coin();
    }
}
