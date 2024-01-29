package org.example.classes;

import java.util.ArrayList;

public class HalvingCarousel extends DecrementingCarousel {
    static int i = 0;

    public HalvingCarousel() {
    }

    public HalvingCarousel(int capacity) {
        super(capacity);
    }

    @Override
    public int next() {
        if (CarouselRun.elements.isEmpty()) {
            return -1;
        }

        int currentValue = CarouselRun.elements.get(i);

        if (shouldRemoveElement(currentValue)) {
            CarouselRun.elements.remove(i);
            if (i >= CarouselRun.elements.size()) {
                i = 0;
            }
        } else {
            updateElementAndIndex(currentValue);
        }

        return currentValue;
    }

    @Override
    public void updateElementAndIndex(int currentValue) {
        CarouselRun.elements.set(i, currentValue / 2);
        i = (i < CarouselRun.elements.size() - 1) ? i + 1 : 0;
    }

}

