package innerClasses.nestedClasses.task17;

public class OuterWithNested {
    public OuterWithNested() {
        System.out.println("OuterWithNested class constructor.");
    }

    public static class Nested {
        public Nested() {
            System.out.println("Nested class constructor.");
        }

        public static class NestedInNested {
            public NestedInNested() {
                System.out.println("NestedInNested class constructor.");
            }
        }
    }
}
