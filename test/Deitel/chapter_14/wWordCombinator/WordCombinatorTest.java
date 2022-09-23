package Deitel.chapter_14.wWordCombinator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordCombinatorTest {
WordCombinator wordCombinator;
    @BeforeEach
  public void setUp() {
       wordCombinator = new WordCombinator();
    }
    @Test
    public void generateThreeWordCombinationTest(){
        String word ="bathe";
     var  combinations = wordCombinator. generateThreeLetterCharacterCombination(word);

     for(String wrd:combinations){
         assertEquals(3,wrd.length());
         assertTrue(wrd.matches("\\w"));


     }

    }
}