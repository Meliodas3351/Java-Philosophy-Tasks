package innerClasses.task11;

public class MyClass {
    private class Circle implements Shape {
        private int radius;
        private double area;

        public Circle(int radius) {
            this.radius = radius;
            this.area = findArea();
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        @Override
        public double findArea() {
            double area = getRadius() * getRadius() * Math.PI;
            return area;
        }
    }

    public Shape getShape(int r) {
        return new Circle(r);
    }
}
