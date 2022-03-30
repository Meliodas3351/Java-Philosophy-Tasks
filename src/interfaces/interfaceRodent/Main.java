package interfaces.interfaceRodent;

public class Main {
    public static void main(String[] args) throws Throwable {
        Rodent[] rodents = new Rodent[10];
        for (int k = 0; k < rodents.length; k++) {
            rodents[k] = Service.createRandomRodent();
        }
        for (Rodent rodent : rodents) {
            Service.eatGrain(rodent);
            System.out.println();
        }
    }
}
