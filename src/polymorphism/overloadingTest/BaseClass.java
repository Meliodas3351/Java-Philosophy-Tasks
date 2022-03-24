package polymorphism.overloadingTest;

public class BaseClass {
    public void useSecondMethod() {
        System.out.println(printInformationAboutClass() + " uses this method");
    }

    public String printInformationAboutClass() {
        return "BaseClass";
    }
}
