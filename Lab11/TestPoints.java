package Lab11;

import java.util.Random;
import java.util.Arrays;

public class TestPoints {
    public static void main(String[] args) {
        Point[] points = new Point[100];
        Random rand = new Random();
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(rand.nextInt(100), rand.nextInt(100));
        }

        Arrays.sort(points);
        System.out.println("Sorted by X-coordinates: " + Arrays.toString(points));
        Arrays.sort(points, new CompareY());
        System.out.println("Sorted by Y-coordinates: " + Arrays.toString(points));
    }
}


