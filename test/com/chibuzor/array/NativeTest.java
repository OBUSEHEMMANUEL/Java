package com.chibuzor.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NativeTest {

    @Test
    public void setCohortIdTest(){
        Native aNative = new Native();
        aNative.setCohordId(13);
        assertEquals(0,aNative.getCohordId());
    }
    @Test
    public void lyingSCVIDTest(){
        Native aNative = new Native();
        aNative.setCohordId(12);
        assertEquals("SCV-UNICORNS0",aNative.getScvaId());
    }

}