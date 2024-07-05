package Lab12;

import java.util.Set;
import java.util.LinkedHashSet;

public class EnhancedSetOperations {
    public static void main(String[] args) {
        Set<String> firstSet = new LinkedHashSet<>(Set.of("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        Set<String> secondSet = new LinkedHashSet<>(Set.of("George", "Katie", "Kevin", "Michelle", "Ryan"));


        Set<String> union = new LinkedHashSet<>(firstSet);
        union.addAll(secondSet);

        Set<String> intersection = new LinkedHashSet<>(firstSet);
        intersection.retainAll(secondSet);

        Set<String> difference = new LinkedHashSet<>(firstSet);
        difference.removeAll(secondSet);

        displayResults("Union", union);
        displayResults("Intersection", intersection);
        displayResults("Difference", difference);
    }

    private static void displayResults(String description, Set<String> results) {
        System.out.printf("%s: %s%n", description, results);
    }
}

