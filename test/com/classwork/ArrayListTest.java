package com.classwork;

import com.classwork.work.ArrayList;
import com.classwork.work.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    List guitarString;
            @BeforeEach
            public void setUp(){
        guitarString = new ArrayList<>();
            }
    @Test
    public void newListIsEmptyTest(){
        List list = new ArrayList<>();
        assertTrue(list.isEmpty());
    }
    @Test
    public void addItemListIsNotEmpty(){
        List list = new ArrayList<>();
        list.add("G-String");
        assertFalse(list.isEmpty());
    }

    @Test
    public void addIteamListIsNotEmpty_SizeIsOneTest(){
        List list = new ArrayList<>();
        list.add("G-String");
        assertFalse(list.isEmpty());
        assertEquals(1,list.size());
    }
@Test
    public void addItemGetItemByIndexTest(){
    guitarString.add("A-string");
    String savedItem = guitarString.get(0);
    assertEquals("A-string", savedItem);
}
@Test
    public void addXYGetXYTest(){
                guitarString.add("A-string");
                guitarString.add("G-string");
                assertEquals("A-string",guitarString.get(0));
                assertEquals("G-string",guitarString.get(1));
}
    @Test
    public void addXYremoveYFindByIndexISnULLtESTTest(){
        guitarString.add("A-string");
        guitarString.add("G-string");
        guitarString.remove(1);
        assertEquals(1,guitarString.size());
        String deletedItem = guitarString.get(1);
        assertNull(deletedItem);

    }
    @Test
    public void addXcontainsxReturnsTrueTest(){
    }
}