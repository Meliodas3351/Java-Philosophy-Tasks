package innerClasses.nestedClasses.task16;

public class MyCLass {
    public MyCLass() {
        System.out.println("Outer class constructor.");
    }

    static class MyNestedClass {
        public MyNestedClass() {
            System.out.println("Nested class constructor.");
        }
    }
}
