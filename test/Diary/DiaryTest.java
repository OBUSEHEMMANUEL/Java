package Diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
Diary diary;
Entry entry;
    @BeforeEach
 public void setUp() {
        diary = new Diary();
        entry = new Entry("The BOOK","My book is red");
    }
    @Test
 public void diaryCanAddTest() {
        diary.add(entry);
        assertEquals(1, diary.size());

    }

}