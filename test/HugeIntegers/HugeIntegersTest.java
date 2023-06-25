package HugeIntegers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegersTest {
    HugeIntegers hugeIntegers;

    @BeforeEach
    void setUp() {
        hugeIntegers = new HugeIntegers("1234567563847563725471234567890123456789");
    }
    @Test
    public void classExistTest(){
        assertNotNull(hugeIntegers);
    }
    @Test
    public void stringToIntegerTest(){

        int[] digit ={1,2,3,4,5,6,7,5,6,3,8,4,7,5,6,3,7,2,5,4,7,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9};

        assertArrayEquals(digit,hugeIntegers.getDigit());
    }
    @Test
    public void addIntegerTest(){
        int[] digit ={1,2,3,4,5,6,7,5,6,3,8,4,7,5,6,3,7,2,5,4,7,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9};
        int[] num = {2,4,6,9,1,3,5,1,2,7,6,9,5,1,2,7,4,5,0,9,4,2,4,6,9,1,3,5,7,8,0,2,4,6,9,1,3,5,7,8};
        assertArrayEquals(num, hugeIntegers.add(hugeIntegers.getDigit(),digit));
    }
    @Test
    public void subtractIntegerTest(){
        int[] num = {2,4,6,9,1,3,5,1,2,7,6,9,5,1,2,7,4,5,0,9,4,2,4,6,9,1,3,5,7,8,0,2,4,6,9,1,3,5,7,8};
        var sub = hugeIntegers.substract(num,hugeIntegers.getDigit());
        int[] answer ={1,2,3,4,5,6,7,5,6,3,8,4,7,5,6,3,7,2,5,4,7,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9};
        assertArrayEquals(answer,sub);
    }
    @Test
    public void toStringTest(){
        int[] digit ={1,2,3,4,5,6,7,5,6,3,8,4,7,5,6,3,7,2,5,4,7,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9};
        String num = "1234567563847563725471234567890123456789";
        assertEquals(num,hugeIntegers.toString(digit));
    }
@Test
    public void isEqual(){
    int[] digit ={2,4,6,9,1,3,5,1,2,7,6,9,5,1,2,7,4,5,0,9,4,2,4,6,9,1,3,5,7,8,0,2,4,6,9,1,3,5,7,8};
    var num = hugeIntegers.iSEqualTo(digit);
    assertTrue(num);
}
}
//[1, 2, 3, 4, 5, 6, 7, 5, 6, 3, 8, 4, 7, 5, 6, 3, 7, 2, 5, 4, 7, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//[1, 2, 3, 4, 5, 6, 7, 5, 6, 3, 8, 4, 7, 5, 6, 3, 7, 2, 5, 4, 7, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
