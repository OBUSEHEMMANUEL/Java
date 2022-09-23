package Diary;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
    User user;
    Entry entry;
    @BeforeEach
    public void setUp() {
        user = new User("Emmanuel","kelechi4");
        entry = new Entry("My diary","The lord is my shepard");
    }
    @Test
    public void nameCanBeGeneratedTest(){
       assertEquals("Emmanuel",user.getName());
    }
    @Test
    public void idCanBeGenerated(){
        user.setId(1);
        assertEquals(1,user.getId());
    }
    @Test
    public void passwordCanBeGenerated(){
        assertEquals("kelechi4",user.getPassword());
    }
    @Test
    public void titleCanBeEnteredTest(){
        assertEquals("My diary",entry.getTitle());
    }
    @Test
    public void bodyCanBeEnteredTest(){
        assertEquals("The lord is my shepard",entry.getBody());
    }


}
