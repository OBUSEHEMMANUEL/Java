package com.classwork;

import com.classwork.work.Factors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorsTest {
    @Test
    public void TestFactorialCanBringOutSize(){
        Factors factor = new Factors();
        int number = factor.factors(10);
        assertEquals(4,number);

    }
    @Test
    public void TestForPrimeNUmber(){
        Factors factor = new Factors();
        boolean number = factor.primeNumber(6);
        assertTrue(false);

    }
}