package polymorphism.starship;

public class Main {
    public static void main(String[] args) {
        Starship starship = new Starship();

        for (int k = 0; k < 15; k++) {
            starship.changeStatus();
        }
    }
}
