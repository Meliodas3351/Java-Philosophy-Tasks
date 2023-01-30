package collections.stack;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String input = "+U+n+c---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        class MyStack<E> {
            private LinkedList<E> linkedList;

            public MyStack() {
                linkedList = new LinkedList<>();
            }

            public void push(E e) {
                linkedList.addFirst(e);
            }

            public E peek() {
                return linkedList.getFirst();
            }

            public E pop() {
                return linkedList.removeFirst();
            }

            public boolean empty() {
                return linkedList.isEmpty();
            }

            @Override
            public String toString() {
                return linkedList.toString();
            }
        }

        MyStack<Character> myStack = new MyStack<>();

        int i = 0;
        while (i < input.length()) {
            if (input.charAt(i++) == '+') {
                myStack.push(input.charAt(i++));
            }else {
                System.out.print(myStack.pop());
            }
        }
    }
}
