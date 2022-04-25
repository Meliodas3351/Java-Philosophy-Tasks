package innerClasses.classesInInterfaces.task19;

public interface Bird {
    void fly();

    void sing();

    void eat();

    class Ostrich implements Bird {
        private String name;
        private String song = "I'm ostrich from Australia";

        public Ostrich(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSong() {
            return song;
        }

        public void setSong(String song) {
            this.song = song;
        }

        @Override
        public String toString() {
            return "Ostrich " + getName();
        }

        @Override
        public void fly() {
            System.out.println(this + " fly.");
        }

        @Override
        public void sing() {
            System.out.println(this + " sing:\t" + getSong());
        }

        @Override
        public void eat() {
            System.out.println(this + " eat.");
        }
    }

    class InnerService {
        public static void useInterfaceMethods(Bird bird) {
            System.out.println(bird + ".fly()");
            bird.fly();
            System.out.println(bird + ".sing()");
            bird.sing();
            System.out.println(bird + ".eat()");
            bird.eat();
        }

        public static void main(String[] args) {
            Bird bird = new Ostrich("Evgen");
            useInterfaceMethods(bird);
        }
    }

}
