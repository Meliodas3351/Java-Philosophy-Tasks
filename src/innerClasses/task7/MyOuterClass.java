package innerClasses.task7;

public class MyOuterClass {
    private String name;

    public MyOuterClass(String name) {
        this.name = name;
    }

    private void printName() {
        System.out.println(this.name);
    }

    class MyInnerClass {
        public void editField(String s) {
            name = s;
        }

        public void useOuterMethod(String s) {
            printName();
            editField(s);
            printName();
        }
    }

    public void useInnerClassMethod() {
        MyInnerClass myInnerClass = new MyInnerClass();
        myInnerClass.useOuterMethod("Alex");
    }

    public static void main(String[] args) {
        MyOuterClass myOuterClass = new MyOuterClass("Nikitos");
        myOuterClass.useInnerClassMethod();
    }
}
