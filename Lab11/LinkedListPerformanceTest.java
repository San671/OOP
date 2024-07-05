package Lab11;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class LinkedListPerformanceTest {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }


        long startTime = System.nanoTime();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTime = System.nanoTime();
        System.out.println("Time using iterator: " + (endTime - startTime) / 1_000_000 + " ms");


        startTime = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time using get(Number): " + (endTime - startTime) / 1_000_000 + " ms");
    }
}


