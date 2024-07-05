package Lab11;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class UniqueElements {
    public static <E> ArrayList<E> deduplicate(ArrayList<E> original) {
        LinkedHashSet<E> set = new LinkedHashSet<>(original);
        return new ArrayList<>(set);
    }
}


