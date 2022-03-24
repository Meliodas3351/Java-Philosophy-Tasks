package polymorphism.rodent;

public class Main {
    public static void main(String[] args) throws Throwable {

        Nut nut = new Nut();
        Rodent[] rodents = new Rodent[10];
        for (int k = 0; k < rodents.length; k++) {
            rodents[k] = Service.createRandomRodent(nut);
        }
        for (Rodent rodent : rodents) {
            Service.eatGrain(rodent);
            System.out.println();
        }
        for (Rodent rodent : rodents) {
            rodent.dispose();
        }

    }
}
