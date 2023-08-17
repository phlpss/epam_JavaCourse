package org.example.classes;

class Triangle {
    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c) {
        if(isTriangle(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Heron's formula: Area = sqrt(s * (s - a) * (s - b) * (s - c))
    public double area() {
        double sideA = length(b, c);
        double sideB = length(a, c);
        double sideC = length(a, b);
        double s = (sideA + sideB + sideC) / 2.0; // Semiperimeter
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }


    public Point centroid() {
        double cx = (a.getX() + b.getX() + c.getX()) / 3.0;
        double cy = (a.getY() + b.getY() + c.getY()) / 3.0;
        return new Point(cx, cy);
    }

    public double length(Point a, Point b) {
        double dx = b.getX() - a.getX();
        double dy = b.getY() - a.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    /*
     the sum of the lengths of any two sides of a triangle must be
     greater than or equal to the length of the third side.
     That sum can equal the length of the third side only in the case of a degenerate triangle,
     one with collinear vertices.
     */
    public boolean isTriangle(Point a, Point b, Point c) {
        return (length(a, b) + length(a, c) > length(b, c) &&
                length(a, b) + length(b, c) > length(a, c) &&
                length(a, c) + length(b, c) > length(a, b) );
    }

}
