package org.example.classes;

import org.example.classes.DecrementingCarousel;
import org.example.classes.HalvingCarousel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeComplianceTest {

    @Test
    void testInheritance() {
        assertEquals(DecrementingCarousel.class, HalvingCarousel.class.getSuperclass());
    }
}
