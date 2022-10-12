package collections.task1;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for (int k = 0; k < 10; k++) {
            gerbils.add(new Gerbil(random.nextInt(20)));
        }
        for (int k = 0; k < gerbils.size(); k++) {
            gerbils.get(k).hop();
        }
    }
}
