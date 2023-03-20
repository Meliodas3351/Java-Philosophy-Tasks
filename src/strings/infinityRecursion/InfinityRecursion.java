package strings.infinityRecursion;

public class InfinityRecursion {
    @Override
    public String toString() {
        return "Infinity recursion - " + super.toString();
    }

    public static void main(String[] args) {
        InfinityRecursion infinityRecursion = new InfinityRecursion();
        System.out.println(infinityRecursion);
    }
}
