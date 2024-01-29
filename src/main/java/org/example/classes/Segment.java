package org.example.classes;

class Segment {
    Point start, end;

    public Segment(Point start, Point end) {
        if (start.getX() == end.getX() && start.getY() == end.getY()) {
            throw new IllegalArgumentException("Degenerate segment: start and end points are the same.");
        }
        this.start = start;
        this.end = end;
    }

    public double length() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point middle() {
        double mx = (start.getX() + end.getX()) / 2.0;
        double my = (start.getY() + end.getY()) / 2.0;
        return new Point(mx, my);
    }

    public Point intersection(Segment another) {
        double x1 = start.getX(), y1 = start.getY();
        double x2 = end.getX(), y2 = end.getY();
        double x3 = another.start.getX(), y3 = another.start.getY();
        double x4 = another.end.getX(), y4 = another.end.getY();

        double denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);

        if (denominator == 0) {
            return null; // Segments are collinear
        }

        double px = ((x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4)) / denominator;
        double py = ((x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4)) / denominator;

        Point intersectionPoint = new Point(px, py);

        if (isPointOnSegment(intersectionPoint) && another.isPointOnSegment(intersectionPoint)) {
            return intersectionPoint;
        }

        return null;
    }

    private boolean isPointOnSegment(Point p) {
        return Math.min(start.getX(), end.getX()) <= p.getX() && p.getX() <= Math.max(start.getX(), end.getX()) &&
                Math.min(start.getY(), end.getY()) <= p.getY() && p.getY() <= Math.max(start.getY(), end.getY());
    }
}
