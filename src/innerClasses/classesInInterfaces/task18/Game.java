package innerClasses.classesInInterfaces.task18;

public interface Game {
    void play();

    String getRules();

    class Chess implements Game {

        @Override
        public void play() {
            System.out.println(this + " play.");
        }

        @Override
        public String getRules() {
            return "Chess rules - ...";
        }

        @Override
        public String toString() {
            return "Chess";
        }

        public static void main(String[] args) {
            Game game = new Game.Chess();
            System.out.println(game.getRules());
            game.play();
        }
    }
}
