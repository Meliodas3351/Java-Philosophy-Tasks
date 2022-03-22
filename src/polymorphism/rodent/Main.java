package polymorphism.rodent;

public class Main {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[10];
        for (Rodent rodent : rodents) {
            rodent = Service.createRandomRodent();
            Service.eatGrain(rodent);
            System.out.println();
        }
    }
}
