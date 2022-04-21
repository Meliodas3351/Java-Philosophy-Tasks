package innerClasses.anonymousFactory.example;

public class Dice implements Game {
    @Override
    public void startGame() {
        System.out.println(this + " started.");
    }

    @Override
    public void makeGameMove() {
        System.out.println(this + ". It's making move. Result - " + GameResultGenerator.generateDiceResult());
    }

    @Override
    public void endGame() {
        System.out.println(this + " ended.");
    }

    @Override
    public String toString() {
        return "Dice Game";
    }

    public static GameFactory returnDiceFactory(){
        return new GameFactory() {
            @Override
            public Game getGame() {
                return new Dice();
            }
        };
    }
}
