package innerClasses.firstInnerClass;

public class Outer {
    private String myStr;

    public Outer(String myStr) {
        this.myStr = myStr;
    }

    class Inner {
        public int i;

        public Inner(int i) {
            this.i = i;
        }

        public int getI() {
            return i;
        }

        @Override
        public String toString() {
            return myStr;
        }
    }

    public Inner createInnerClassObject(int i) {
        return new Inner(i);
    }
}
