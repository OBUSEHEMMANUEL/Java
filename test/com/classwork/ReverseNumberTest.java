package com.classwork;

import com.classwork.work.ReverseNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {
    @Test
    public void reverse(){
        ReverseNumber reverseNumber = new ReverseNumber();
        assertEquals(54321,reverseNumber.reverse(12345));
}
}