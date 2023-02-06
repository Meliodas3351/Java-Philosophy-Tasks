package exceptions.start_tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Task12 {
}

class CollectionSequence implements Collection<Command> {
    private ArrayList<Command> commands;
    private int maxSize;


    public CollectionSequence(ArrayList<Command> commands, int maxSize) {
        this.commands = commands;
        this.maxSize = maxSize;
    }

    @Override
    public int size() {
        return commands.size();
    }

    @Override
    public boolean isEmpty() {
        return commands.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return commands.contains(o);
    }

    @Override
    public Iterator<Command> iterator() {
        return new Iterator<Command>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < commands.size();
            }

            @Override
            public Command next() {
                return commands.get(index++);
            }
        };
    }

    @Override
    public Object[] toArray() {
        return commands.toArray(Command[]::new);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Command command) {
        if (commands.size() < maxSize) {
            return commands.add(command);
        } else {
            try {
                throw new OfBoundsException();
            } catch (OfBoundsException e) {
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        return commands.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return commands.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Command> c) {
        return commands.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return commands.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return commands.retainAll(c);
    }

    @Override
    public void clear() {

    }
}

class Command {
    private String str;

    public Command(String str) {
        this.str = str;
    }

    public void operation() {
        System.out.println(str);
    }
}

class OfBoundsException extends Exception {

}


