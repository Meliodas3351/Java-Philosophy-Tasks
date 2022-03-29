package interfaces.usingAbstractMethodsInConstructors;

public class Person extends MyAbstractClass {
    private int age = 20;

    @Override
    public void print() {
        System.out.println("Age - " + age);
    }
}
