package Lab11;

public class ArrayOperations {
    public static <E extends Comparable<E>> E findMax(E[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        E maximum = array[0];
        for (E element : array) {
            if (element.compareTo(maximum) > 0) {
                maximum = element;
            }
        }
        return maximum;
    }
}

