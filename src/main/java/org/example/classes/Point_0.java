package org.example.classes;

public class Point_0 {
    final int x;
    final int y;

    public Point_0(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d;%d)", x, y);
    }
}
