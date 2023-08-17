package org.example.classes;

public class Line {
    private int k;
    private int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        if(this.k == other.k) {
            return null;
        }
        int x = (other.b - this.b) / (this.k - other.k);
        int y = this.k * x + this.b;
        Point result = new Point(x, y);
        return result;
    }

}

