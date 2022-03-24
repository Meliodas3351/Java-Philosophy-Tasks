package polymorphism.overloadingTest;

public class Main {
    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        DaughterClass daughterClass = new DaughterClass();
        baseClass.useSecondMethod();
        daughterClass.useSecondMethod();
    }
}
