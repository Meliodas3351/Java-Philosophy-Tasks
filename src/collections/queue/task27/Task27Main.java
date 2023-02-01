package collections.queue.task27;

import java.util.*;

public class Task27Main {
    private static void printQueue(Queue<Command> queue) {
        while (queue.peek() != null) {
            queue.poll().operation();
        }
    }

    public static void main(String[] args) {
//        PriorityQueue<String> commands = new PriorityQueue<>(Arrays.asList("First","Second", "Third","Fourth"));
//        printQueue(commands);
//        PriorityQueue<Command> integers = Service.createPriorityQueue();
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        Random random = new Random();
        for (int k = 0; k < 20; k++) {
            priorityQueue.offer(random.nextDouble());
        }
        while (priorityQueue.peek() != null) {
            System.out.println(priorityQueue.poll());
        }
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

class Service {
    public static Queue<Command> createQueue(String... strings) {
        Queue<Command> commands = new LinkedList<>();
        for (String string : strings) {
            commands.offer(new Command(string));
        }
        return commands;
    }

    public static PriorityQueue<Command> createPriorityQueue(String... strings) {
        PriorityQueue<Command> commands = new PriorityQueue<>();
        for (String string : strings) {
            commands.offer(new Command(string));
        }
        return commands;
    }
}
