package innerClasses.sequence;

public class Sequence {
    private MyClass[] myClasses;
    private int nextIndex = 0;

    public Sequence(int size) {
        myClasses = new MyClass[size];
    }

    public void add(MyClass myClass) {
        myClasses[nextIndex++] = myClass;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean isArrayFull() {
            return i == myClasses.length;
        }

        @Override
        public Object current() {
            return myClasses[i];
        }

        @Override
        public void next() {
            if (i < myClasses.length) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    @Override
    public String toString() {
        String str = "";
        for (MyClass myClass : myClasses) {
            str += myClass.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int k = 0; k < 10; k++) {
            sequence.add(new MyClass(Integer.toString(k)));
        }
    }
}
