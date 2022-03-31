package interfaces.charArrayGenerator;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class CharArrayGenerator implements Readable {
    private Random rnd = new Random();
    private static final int countOfSymbols = 256;
    private int count;

    public CharArrayGenerator(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (--count == 0) {
            return -1;
        }
        int index;
        for (int k = 0; k < 10; k++) {
            index = rnd.nextInt(countOfSymbols);
            //System.out.println(index);
            cb.append((char) index);
        }
        cb.append(" ");
        return 11;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new CharArrayGenerator(10));

        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
