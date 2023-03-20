package strings.formatter;

import java.io.FileReader;
import java.util.Formatter;

public class Receipt {
    private static final int FIRST = -15, SECOND = 10, THIRD = 20;
    private static final String test = "%" + FIRST + "s %5s %10s\n";
    private double total = 0;
    private Formatter formatter = new Formatter(System.out);

    public void printTitle() {
        formatter.format("%" + FIRST + "s %" + SECOND + "s %" + THIRD + "s\n", "Item", "Qty", "Price");
        formatter.format("%" + FIRST + "s %" + SECOND + "s %" + THIRD + "s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        formatter.format("%" + FIRST + "s %" + SECOND + "s %" + THIRD + ".2f\n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        formatter.format("%" + FIRST + "s %" + SECOND + "s %" + THIRD + ".2f\n", "Tax", "", total * 0.06);
        formatter.format("%" + FIRST + "s %" + SECOND + "s %" + THIRD + "s\n", "", "", "-----");
        formatter.format("%" + FIRST + "s %" + SECOND + "s %" + THIRD + ".2f\n", "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Горох", 2, 1.5);
        receipt.print("Свиника", 4, 18);
        receipt.printTotal();
    }
}

