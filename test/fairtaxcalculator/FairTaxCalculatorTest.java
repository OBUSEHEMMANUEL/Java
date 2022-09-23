package fairtaxcalculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FairTaxCalculatorTest {
 FairTaxCalculator fairTaxCalculator;
 @BeforeEach
    public void setUp(){
     fairTaxCalculator = new  FairTaxCalculator();
 }
 @Test
    void testThatFairTaxCanBeCalculated(){
     //Given
     Product product = new Product("milo",100.00);
   double tax =  fairTaxCalculator.calculateTax(product.getPrice());
    assertEquals(23,tax);
 }
 @Test
    void productTestPriceCanBeCalculatedTest(){
     fairTaxCalculator.setTotalPrice(50);
     double total = fairTaxCalculator.calculateTotalPrice(30.00);
     assertEquals(80,fairTaxCalculator.getTotalPrice());

 }
}
