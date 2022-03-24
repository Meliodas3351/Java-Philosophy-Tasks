package polymorphism.referenceCounting;

public class Main {
    public static void main(String[] args) throws Throwable {
        Shared shared = new Shared();
        Composing[] composings = new Composing[]{new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)};
        for (Composing composing : composings) {
            composing.dispose();
        }


    }
}
