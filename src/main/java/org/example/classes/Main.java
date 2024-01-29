package org.example.classes;
// check all tasks in module "Classes" and "Intro to OOP"
public class Main {
    public static void main(String[] args) {
        {
//        Scanner scanner = new Scanner(System.in);
//        int k1 = scanner.nextInt();
//        int b1 = scanner.nextInt();
//        int k2 = scanner.nextInt();
//        int b2 = scanner.nextInt();
//
//        Line line1 = new Line(k1,b1);
//        Line line2 = new Line(k2,b2);
//
//            Line line1 = new Line(0, -8);
//            Line line2 = new Line(0, 2);
//
//            System.out.println("Line intersection:\t" + line1.intersection(line2));
//        }
//        ///////////////////////////////////////////////////////////////
//        System.out.println();
//        {
//            double length = new Segment(new Point(0, 0), new Point(3, 4)).length();
//            System.out.println("Lenght of Segment:\t" + length);
//        }
//        ////////////////////////////////////////////////////////////////
//        {
//            Segment first = new Segment(new Point(0, 0), new Point(4, 4));
//            Segment second = new Segment(new Point(2, 0), new Point(0, 2));
//            Point intersection = first.intersection(second);
//
//            System.out.println(intersection.getX());
//            System.out.println(intersection.getY());
//        }
//        ////////////////////////////////////////////////////////////////
//        {
//            Segment first = new Segment(new Point(0, 0), new Point(4, 0));
//            Segment second = new Segment(new Point(2, 1), new Point(1, 2));
//            Point intersection = first.intersection(second);
//
//            System.out.println(intersection == null);
//        }
//        ////////////////////////////////////////////////////////////////
//        {
//            System.out.println();
//            double area = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4)).area();
//            System.out.println("Area of triangle:\t" + area);
//        }
//        ////////////////////////////////////////////////////////////////
//        {
//            Point centroid = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 3)).centroid();
//
//            System.out.println("Centeroid(getX) of triangle:\t" + centroid.getX());
//            System.out.println("Centeroid(getY) of triangle:\t" + centroid.getY());
//        }
        ////////////////////////////////////////////////////////////////

        /** DecrementingCarousel **/
        {
            System.out.println("\nRefusing adding more elements case:");
            DecrementingCarousel carousel = new DecrementingCarousel(3);

            System.out.println(carousel.addElement(-2) + "\t" + carousel.addElement(0));                                //false false
            System.out.println(carousel.addElement(2) + "\t" + carousel.addElement(3) + "\t" + carousel.addElement(1)); //true true true
            //carousel is full
            System.out.println(carousel.addElement(2)); //false

            CarouselRun run = carousel.run();

            System.out.print(run.next() + "\t" + run.next() + "\t" + run.next() + "\n");    // 2 3 1
            System.out.print(run.next() + "\t" + run.next() + "\n");                        // 1 2
            System.out.println(run.next());                                                 // 1

            System.out.println("is finished: " + run.isFinished()); //true
            System.out.println(run.next()); //-1
        }
        {
            System.out.println("\nRefusing to add more elements after \"run\" was called:");
            DecrementingCarousel carousel = new DecrementingCarousel(10);

            System.out.println(carousel.addElement(2) + "\t" + carousel.addElement(3) + "\t" + carousel.addElement(1)); //true true true
            carousel.run();
            System.out.println(carousel.addElement(2) + "\t" + carousel.addElement(3) + "\t" + carousel.addElement(1)); //false false false
        }
        {
            System.out.println("\nRefusing to create more than one CarouselRun:");
            DecrementingCarousel carousel = new DecrementingCarousel(10);
            System.out.println(carousel.run() == null); //false
            System.out.println(carousel.run() == null); //true
        }
// input array and then output array >
// [9, 8, 4, 5, 5, 5, 7, 9, 9, 10, 4, 8, 4, 3, 5, 8, 7, 3, 4, 4, 4, 6, 8, 8, 9, 3, 7, 3, 2, 4, 6, 5, 1, 2, 2, 2, 4, 6, 6, 7, 1, 5, 1, 2, 3, 2, 1, 3, 3, 4, 2]
// [9, 8, 4, 5, 5, 5, 7, 9, 9, 10, 4, 8, 4, 3, 5, 8, 7, 3, 4, 4, 4, 6, 8, 8, 9, 3, 7, 3, 2, 4, 6, 5,    2, 2, 2, 4, 6, 6, 7,    5,    2, 3, 2,    3, 3, 4, 2]

// expected: [4, 7, 9, 4, 6, 7, 5, 10, 3, 8, 1, 10, 2, 10, 10, 3, 3, 6, 8, 3, 5, 6, 4, 9, 2, 7, 9, 1, 9, 9, 2, 1, 4, 6, 1, 3, 4, 2, 7, 5, 7, 7, 7, 1, 3, 1, 4, 2, 4, 4, 4]
// but was:  [4, 7, 9, 4, 6, 7, 5, 10, 3, 8, 1, 10, 2, 10, 10, 3]>

        /** HalvingCarousel **/
        {
            System.out.println("\nHalvingCarousel -->");
            DecrementingCarousel carousel = new HalvingCarousel(7);

            carousel.addElement(20);
            carousel.addElement(30);
            carousel.addElement(10);

            CarouselRun run = carousel.run();

            System.out.println("Is finished: " + run.isFinished()); //false

            System.out.print(run.next() + "\t" + run.next() + "\t" + run.next() + "\n");    // 20 30 10
            System.out.print(run.next() + "\t" + run.next() + "\t" + run.next() + "\n");    // 10 15 5
            System.out.print(run.next() + "\t" + run.next() + "\t" + run.next() + "\n");    // 5  7  2
            System.out.print(run.next() + "\t" + run.next() + "\t" + run.next() + "\n");    // 2  3  1
            System.out.print(run.next() + "\t" + run.next() + "\n");                        // 1  1

            System.out.println("Is finished: " + run.isFinished()); //true
            System.out.println(run.next()); //-1
        }
        ////////////////////////////////////////////////////////////////
        /** GraduallyDecreasingCarousel **/
        {
            System.out.println("\nGraduallyDecreasingCarousel -->");
            DecrementingCarousel carousel = new GraduallyDecreasingCarousel(7);

            carousel.addElement(20);
            carousel.addElement(30);
            carousel.addElement(10);

            CarouselRun run = carousel.run();

            System.out.println("Is finished: " + run.isFinished()); //false

            System.out.print(run.next() + "\t" + run.next() + "\t" + run.next() + "\n");    // 20 30 10
            System.out.print(run.next() + "\t" + run.next() + "\t" + run.next() + "\n");    // 19 29 9
            System.out.print(run.next() + "\t" + run.next() + "\t" + run.next() + "\n");    // 17 27 7
            System.out.print(run.next() + "\t" + run.next() + "\t" + run.next() + "\n");    // 14 24 4
            System.out.print(run.next() + "\t" + run.next() + "\n");                        // 10 20
            System.out.print(run.next() + "\t" + run.next() + "\n");                        // 5  15
            System.out.print(run.next() + "\n");                                            // 9
            System.out.print(run.next() + "\n");                                            // 2

            System.out.println("Is finished: " + run.isFinished()); //true
            System.out.println(run.next() + "\n\n"); //-1}
        }
    }

}}


