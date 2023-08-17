package org.example.classes;

public class Main {
    public static void main(String[] args) {
        {
//        Scanner scanner = new Scanner(System.in);
//        int k1 = scanner.nextInt();
//        int b1 = scanner.nextInt();
//        int k2 = scanner.nextInt();
//        int b2 = scanner.nextInt();

//        Line line1 = new Line(k1,b1);
//        Line line2 = new Line(k2,b2);

            Line line1 = new Line(0, -8);
            Line line2 = new Line(0, 2);

            System.out.println("Line intersection:\t" + line1.intersection(line2));
        }

        ////////////////////////////////////////////////////////////////
        System.out.println();
        {
            double length = new Segment(new Point(0, 0), new Point(3, 4)).length();
            System.out.println("Lenght of Segment:\t" + length);
        }

        {
            Segment first = new Segment(new Point(0, 0), new Point(4, 4));
            Segment second = new Segment(new Point(2, 0), new Point(0, 2));
            Point intersection = first.intersection(second);

            System.out.println(intersection.getX());
            System.out.println(intersection.getY());
        }

        {
            Segment first = new Segment(new Point(0, 0), new Point(4, 0));
            Segment second = new Segment(new Point(2, 1), new Point(1, 2));
            Point intersection = first.intersection(second);

            System.out.println(intersection == null);
        }

        ////////////////////////////////////////////////////////////////
        {
            System.out.println();
            double area = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4)).area();
            System.out.println("Area of triangle:\t" + area);
        }
        {
            Point centroid = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 3)).centroid();

            System.out.println("Centeroid(getX) of triangle:\t" + centroid.getX());
            System.out.println("Centeroid(getY) of triangle:\t" + centroid.getY());
        }


    }

}

