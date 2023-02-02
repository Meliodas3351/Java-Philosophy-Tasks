package collections.multiiterableclass;

import java.util.*;

public class MultiIterableClass implements Iterable<Integer> {
    private ArrayList<Integer> numbers;

    public MultiIterableClass() {
        numbers =  new ArrayList<>();
        Random random = new Random();
        for (int k = 0; k < 20; k++) {
            numbers.add(random.nextInt(50));
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return numbers.iterator();
    }

    public Iterable<Integer> reverseIterator() {
        return new Iterable<Integer>() {
            @Override
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() {
                    private int index = numbers.size() - 1;

                    @Override
                    public boolean hasNext() {
                        return index >= 0;
                    }

                    @Override
                    public Integer next() {
                        return numbers.get(index--);
                    }
                };
            }
        };
    }

    public Iterable<Integer> randomizedIterator() {
        return new Iterable<Integer>() {
            @Override
            public Iterator<Integer> iterator() {
                List<Integer> shuffled = (List<Integer>) numbers.clone();
                Collections.shuffle(shuffled);
                return shuffled.iterator();
            }
        };

    }

    public static void main(String[] args) {
        MultiIterableClass multiIterableClass = new MultiIterableClass();
        for (Integer i : multiIterableClass.randomizedIterator()) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : multiIterableClass) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : multiIterableClass.reverseIterator()) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
