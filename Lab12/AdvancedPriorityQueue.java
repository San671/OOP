package Lab12;

import java.util.PriorityQueue;
import java.util.Comparator;

public class AdvancedPriorityQueue<E> extends PriorityQueue<E> {
    public AdvancedPriorityQueue(Comparator<? super E> comparator) {
        super(11, comparator);
    }
}

