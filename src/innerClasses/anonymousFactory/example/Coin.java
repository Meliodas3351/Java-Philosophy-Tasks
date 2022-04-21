package innerClasses.anonymousFactory.example;

public class Coin implements Game {
    @Override
    public void startGame() {
        System.out.println(this + " started.");
    }

    @Override
    public void makeGameMove() {
        System.out.println(this + ". It's making move. Result - " + GameResultGenerator.generateCoinResult());
    }

    @Override
    public void endGame() {
        System.out.println(this + " ended.");
    }

    @Override
    public String toString() {
        return "Coin Game";
    }

    public static GameFactory returnCoinFactory(){
        return new GameFactory() {
            @Override
            public Game getGame() {
                return new Coin();
            }
        };
    }
}
