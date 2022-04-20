package innerClasses.secondInnerClass;

public class Outer {
    public class Inner {
        public Outer createOuter() {
            return Outer.this;
        }

        @Override
        public String toString() {
            return "Inner";
        }
    }

    @Override
    public String toString() {
        return "Outer";
    }

    public Inner createInner() {
        return new Inner();
    }
}
