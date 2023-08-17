package org.example.classes;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int k1 = scanner.nextInt();
//        int b1 = scanner.nextInt();
//        int k2 = scanner.nextInt();
//        int b2 = scanner.nextInt();

//        Line line1 = new Line(k1,b1);
//        Line line2 = new Line(k2,b2);

        Line line1 = new Line(0,-8);
        Line line2 = new Line(0,2);

        System.out.println("result is " + line1.intersection(line2));

        ////////////////////////////////////////////////////////////////
        {
            double length = new Segment(new Point_2(0, 0), new Point_2(3, 4)).length();
            System.out.println(length);
        }

        {
            Segment first = new Segment(new Point_2(0, 0), new Point_2(4, 4));
            Segment second = new Segment(new Point_2(2, 0), new Point_2(0, 2));
            Point_2 intersection = first.intersection(second);

            System.out.println(intersection.getX());
            System.out.println(intersection.getY());
        }

        {
            Segment first = new Segment(new Point_2(0, 0), new Point_2(4, 0));
            Segment second = new Segment(new Point_2(2, 1), new Point_2(1, 2));
            Point_2 intersection = first.intersection(second);

            System.out.println(intersection == null);
        }

    }

}

