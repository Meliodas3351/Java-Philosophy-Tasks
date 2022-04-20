package innerClasses.task6.BaseClass;

import innerClasses.task6.interfacePackage.Superhero;

public class SuperheroTeam {
    protected class Hulk implements Superhero {

        private String name = "Hulk";
        private int countOfFeats = 0;

        @Override
        public void performFeat() {
            System.out.println(this + " performed a feat.");
            countOfFeats++;
            System.out.println("Total count of feats - " + getCountOfFeats());

        }

        @Override
        public String toString() {
            return "Hulk";
        }

        public int getCountOfFeats() {
            return countOfFeats;
        }

        public void setCountOfFeats(int countOfFeats) {
            this.countOfFeats = countOfFeats;
        }
    }

    public Superhero getHulk() {
        return new Hulk();
    }
}
