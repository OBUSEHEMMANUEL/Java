package com.chibuzor.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestElementTest {
    LargestElement largestElement;
    @BeforeEach
    public void setUp(){
        largestElement = new LargestElement();
    }
    @Test
    public void largestNumberTest() {
        int[] array = {2,5,7,9,3,4,1};

        assertEquals(9,largestElement.largestElement1(array));

    }
}