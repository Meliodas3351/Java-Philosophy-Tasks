package innerClasses.task9_10;

public class MyClass {
    public static Animal getAnimal(boolean b, String s) {
        if (b) {
            class Cat implements Animal {
                private String name;

                public Cat(String name) {
                    this.name = name;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                @Override
                public void say() {
                    System.out.println(this + " said meow!");
                }

                @Override
                public String toString() {
                    return name;
                }
            }
            return new Cat(s);
        }
        class Dog implements Animal {
            private String name;

            public Dog(String name) {
                this.name = name;
            }

            @Override
            public void say() {
                System.out.println(this + " said gow!");
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return name;
            }
        }
        return new Dog(s);
    }

    public static void main(String[] args) {
        Animal animal = getAnimal(true, "Sharik");
        animal.say();
        animal = getAnimal(false, "Mursik");
        animal.say();
    }
}
