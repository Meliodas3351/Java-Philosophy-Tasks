package innerClasses.firstInnerClass;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer("String value");
        Outer.Inner inner = outer.createInnerClassObject(10);
        System.out.println(inner.getI());
        System.out.println(inner.toString());
    }
}
