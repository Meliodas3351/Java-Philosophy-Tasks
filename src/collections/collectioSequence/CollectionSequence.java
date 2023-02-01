package collections.collectioSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionSequence implements Collection<Command> {
    ArrayList<Command> commands;

    public CollectionSequence(ArrayList<Command> commands) {
        this.commands = commands;
    }

    @Override
    public int size() {
        return commands.size();
    }

    @Override
    public boolean isEmpty() {
        return commands.size()==0;
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
                return index<commands.size();
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
        return commands.add(command);
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


