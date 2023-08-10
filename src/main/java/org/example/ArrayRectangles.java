package org.example;

public class ArrayRectangles {
    private Rectangle[] rectangleArray;

    // Constructor that creates a null-elements array of the given length.
    // It should throw an IllegalArgumentException if the length is negative or zero.
    public ArrayRectangles(int length) {
        if (length <= 0) throw new IllegalArgumentException("Length must be grater than 0");
        rectangleArray = new Rectangle[length];
    }

    // Constructor that receives an arbitrary number of Rectangle objects or an array of Rectangle objects.
    // It should throw IllegalArgumentException if the array is null or the array length is zero.
    // It's guaranteed that the array does not contain null values.
    public ArrayRectangles(Rectangle... rectangles) {
        if (rectangles == null) throw new IllegalArgumentException("Rectangles array must not be null");
        if (rectangles.length == 0) throw new IllegalArgumentException("Rectangles array must not be empty");

        rectangleArray = new Rectangle[rectangles.length];
        for (int i = 0; i < rectangles.length; i++) {
            rectangleArray[i] = rectangles[i];
        }
    }

    // Method addRectangle that adds a Rectangle object to the array at the nearest empty place
    // and returns true or false if there is no free space in the array.

    public boolean addRectangle(Rectangle rectangle) {
        for(int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] == null) {
                rectangleArray[i] = rectangle;
                return true;
            }
        }
        return false;
    }

    // Method size that returns the actual amount of elements in the array.
    // If addRectangle returns true, then this method should return new amount of elements.
    public int size() {
        int counter = 0;
        for(Rectangle i : rectangleArray) {
            if (i == null) break;
            counter++;
        }
        return counter;
    }

    // Method indexMaxArea that returns the index
    // of the first rectangle with the maximum area in the array.
    public int indexMaxArea() {
        int maxIndex = -1;
        double maxArea = -1.0;

        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] != null && rectangleArray[i].area() > maxArea) {
                maxArea = rectangleArray[i].area();
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Method indexMinPerimeter that returns the index of the
    // first rectangle with the minimum perimeter in the array.
    public int indexMinPerimeter() {
        int minIndex = -1;
        double minPerimeter = Double.MAX_VALUE;

        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] != null && rectangleArray[i].perimeter() < minPerimeter) {
                minPerimeter = rectangleArray[i].perimeter();
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Method numberSquares that returns the number of squares in the array.
    public int numberSquares() {
        int counter = 0;
        for(Rectangle i : rectangleArray) {
            if (i != null && i.isSquare()) {
                counter++;
            }
        }
        return counter;
    }
}
