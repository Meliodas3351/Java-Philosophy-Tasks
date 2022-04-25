package innerClasses.nestedClasses.task17;

public class Main {
    public static void main(String[] args) {
        System.out.println("Experiment with inner classes:");
        OuterWithInner.Inner.InnerInInner innerInInner = new OuterWithInner().new Inner().new InnerInInner();
        System.out.println("Experiment with nested classes:");
        OuterWithNested.Nested.NestedInNested nestedInNested = new OuterWithNested.Nested.NestedInNested();
    }
}
