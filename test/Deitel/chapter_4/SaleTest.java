package Deitel.chapter_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SaleTest {
    SalesPerson derek;
    Items iphone;


    @BeforeEach
    public void setup() {
        derek = new SalesPerson();
        iphone = new Items(1000);

    }

    @Test
    public void addItem(){

derek.setSoldItems(iphone);
assertEquals(iphone,derek.getSoldItems());

    }

}