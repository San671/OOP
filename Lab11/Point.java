package Lab11;

import java.util.Comparator;
import java.util.Random;
import java.util.Arrays;

public class Point implements Comparable<Point> {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point that) {
        if (this.x != that.x) return this.x - that.x;
        return this.y - that.y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}



