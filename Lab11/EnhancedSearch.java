package Lab11;

public class EnhancedSearch {
    public static <E extends Comparable<E>> int linearSearch(E[] array, E target) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].compareTo(target) == 0) {
                return i;
            }
        }
        return -1;
    }
}

