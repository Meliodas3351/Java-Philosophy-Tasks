package interfaces.superVillain;

public class Main {
    public static void main(String[] args) {
        Joker joker = new Joker();
        Service.useThiefMethods(joker);
        System.out.println();
        Service.useTerroristMethods(joker);
        System.out.println();
        Service.useKillerMethods(joker);
        System.out.println();
        Service.useSuperVillainMethods(joker);
    }
}
