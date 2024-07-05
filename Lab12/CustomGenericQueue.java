package Lab12;

import java.util.LinkedList;

public class CustomGenericQueue<E> extends LinkedList<E> {
    public void enqueue(E element) {
        addLast(element);
        System.out.println("Enqueued: " + element);
    }

    public E dequeue() {
        E element = removeFirst();
        System.out.println("Dequeued: " + element);
        return element;
    }

    public int getSize() {
        return size();
    }
}

