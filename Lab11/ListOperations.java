package Lab11;

import java.util.ArrayList;

public class ListOperations {
    public static <E extends Comparable<E>> E findMaxInList(ArrayList<E> list) {
        if (list == null) {
            throw new IllegalArgumentException("The provided list cannot be null");
        }
        if (list.isEmpty()) {
            throw new IllegalStateException("The list cannot be empty");
        }
        E maximum = list.get(0);
        for (E element : list) {
            if (element != null && (element.compareTo(maximum) > 0)) {
                maximum = element;
            }
        }
        if (maximum == null) {
            throw new IllegalStateException("All elements in the list are null");
        }
        return maximum;
    }
}




