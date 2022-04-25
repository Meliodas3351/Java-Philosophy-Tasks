package innerClasses.nestedClasses.task17;

public class OuterWithInner {
    public OuterWithInner() {
        System.out.println("OuterWithInner class constructor.");
    }

    public class Inner {
        public Inner() {
            System.out.println("Inner class constructor.");
        }

        public class InnerInInner {
            public InnerInInner() {
                System.out.println("InnerInInner class constructor.");
            }
        }
    }
}