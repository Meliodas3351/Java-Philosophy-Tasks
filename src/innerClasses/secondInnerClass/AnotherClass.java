package innerClasses.secondInnerClass;

public class AnotherClass {
    Outer outer;
    Outer.Inner inner;

    public AnotherClass() {
        Outer outer1 = new Outer();
        inner = outer1.new Inner();
        outer = inner.createOuter();
        System.out.println(inner.toString());
        System.out.println(outer.toString());
    }

    public static void main(String[] args) {
        AnotherClass anotherClass = new AnotherClass();
    }
}
