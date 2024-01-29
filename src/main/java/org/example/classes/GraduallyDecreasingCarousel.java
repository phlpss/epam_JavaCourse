package org.example.classes;

public class GraduallyDecreasingCarousel extends DecrementingCarousel {
    static int currentIndex = 0;
    static int decrementValue = 1;

    public GraduallyDecreasingCarousel() {
    }

    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public int next() {
        if (CarouselRun.elements.isEmpty()) {
            return -1;
        }

        int currentValue = CarouselRun.elements.get(currentIndex);

        // remove element if value <= 1 or update element`s value
        if (shouldRemoveElement(currentValue)) {
            CarouselRun.elements.remove(currentIndex);
            resetIndexAndIncrementDecrementValue();
        } else {
            updateElementAndIndex(currentValue);
        }
        return currentValue;
    }

    @Override
    boolean shouldRemoveElement(int value) {
        return value - decrementValue <= 1;
    }

    @Override
    public void updateElementAndIndex(int currentValue) {
        CarouselRun.elements.set(currentIndex, currentValue - decrementValue);
        incrementIndexOrReset();
    }

    private void resetIndexAndIncrementDecrementValue() {
        if (currentIndex >= CarouselRun.elements.size()) {
            currentIndex = 0;
            decrementValue++;
        }
    }

    private void incrementIndexOrReset() {
        if (currentIndex < CarouselRun.elements.size() - 1) {
            currentIndex++;
        } else {
            currentIndex = 0;
            decrementValue++;
        }
    }
}
