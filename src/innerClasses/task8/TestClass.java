package innerClasses.task8;

public class TestClass {
    class Inner {
        private String city;

        public Inner(String city) {
            this.city = city;
        }
    }

    public void getPrivateFieldFromInnerClass(String s) {
        Inner inner = new Inner(s);
        System.out.println(inner.city);
    }

}