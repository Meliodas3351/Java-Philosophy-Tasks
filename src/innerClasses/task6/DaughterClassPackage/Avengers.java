package innerClasses.task6.DaughterClassPackage;

import innerClasses.task6.BaseClass.SuperheroTeam;
import innerClasses.task6.interfacePackage.Superhero;

public class Avengers extends SuperheroTeam {
    Superhero superhero;

    Avengers(int feats) {
        superhero = super.getHulk();
        for (int k = 0; k < feats; k++) {
            superhero.performFeat();
        }

    }

    public static void main(String[] args) {
        Avengers avengers = new Avengers(10);
    }
}
