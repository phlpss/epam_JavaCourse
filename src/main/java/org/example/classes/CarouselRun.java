package org.example.classes;

import java.util.List;

/**
 * The CarouselRun iterates over elements in the order of their insertion.
 * When an element is decreased to zero, the CarouselRun will skip it in further iterations.
 * When there are no more elements available for decrementing, the CarouselRun returns -1.
 * <p>
 * The CarouselRun also has the isFinished method, which indicates,
 * if the carousel has run out of the elements to decrement.
 */


public class CarouselRun {
    static int i = 0;
    private final int capacity;
    private boolean running;
    static List<Integer> elements;
    private DecrementingCarousel carousel;

    public CarouselRun(int capacity, boolean running, List<Integer> elements, int i, DecrementingCarousel carousel) {
        this.capacity = capacity;
        this.running = running;
        this.elements = elements;
        this.i = i;
        this.carousel = carousel;
    }

    /**
     * returns the current value of the current element,
     * then decreases the current element by one and switches to the next element in insertion order.
     * Skips zero elements. When there is no more elements to decrease, returns -1
     */
    public int next() {
        return carousel.next();
    }

    public boolean isFinished() {
        return elements.isEmpty() || elements.size() >= capacity;
    }
}
