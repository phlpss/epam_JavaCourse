package org.example.classes;

import java.util.ArrayList;

/**
 * DecrementingCarousel is a container, accepting int elements.
 * DecrementingCarousel has a maximum capacity, specified via the constructor.
 * When created, DecrementingCarousel is in accumulating state:
 * you may add elements via the addElement method and
 * can produce a CarouselRun object via the run method.
 * Once the run method is called, DecrementingCarousel is in running state:
 * it refuses adding more elements.
 * CarouselRun run() - returns a CarouselRun to iterate over the elements. If the run method has already been called earlier,
 * it must return null: DecrementingCarousel may generate only one CarouselRun object.
 **/

public class DecrementingCarousel {
    private final int capacity;
    private boolean running;
    protected ArrayList<Integer> elements = new ArrayList<>();

    public DecrementingCarousel() {
        this.capacity = 0;
    }

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
    }

    public boolean addElement(int element) {
        if (element <= 0 || elements.size() >= capacity || running) {
            return false;
        }
        elements.add(element);
        return true;
    }

    public CarouselRun run() {
        if (running) {
            return null;
        }
        running = true;
        return new CarouselRun(capacity, running, elements);
    }
}

