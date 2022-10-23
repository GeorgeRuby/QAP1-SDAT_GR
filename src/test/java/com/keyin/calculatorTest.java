package com.keyin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Common test methods
// assertEquals
// assertNotEquals
// assertTrue
// assertFalse
// assertNull
// assertNotNull

class calculatorTest {
    @Test // Hover over the word to bring up the import
    void twoPlusTwoEqualsFour() {
        calculator myCalculator = new calculator();
        assertEquals(4, myCalculator.add(2, 2));
    }
    @Test
    void fourMinusTwoEqualsTwo(){
        calculator myCalculator = new calculator();
        assertNotEquals(1, myCalculator.subtract(4, 2));
    }
    @Test
    void twoTimesTwoEqualsFour(){
        calculator myCalculator = new calculator();
        assertEquals(4, myCalculator.multiply(2, 2));
    }
    @Test
    void fourDevidedbyTwoEqualsTwo(){
        calculator myCalculator = new calculator();
        assertEquals(2, myCalculator.devide(4, 2));
    }



}