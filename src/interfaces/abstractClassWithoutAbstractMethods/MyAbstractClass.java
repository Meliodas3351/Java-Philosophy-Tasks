package interfaces.abstractClassWithoutAbstractMethods;

public abstract class MyAbstractClass {
    public void printAge(int age) {
        System.out.println("Age - " + age);
    }

    public double findAreaOfCircle(int radius) {
        double area = radius * radius * Math.PI;
        return area;
    }
}
