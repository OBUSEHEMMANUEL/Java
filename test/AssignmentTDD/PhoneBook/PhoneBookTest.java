package AssignmentTDD.PhoneBook;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook phoneBook;
    @BeforeEach
    public void setUp(){
        phoneBook = new PhoneBook();
    }
  @Test
  public void nameCanBeAdded(){
        phoneBook.name("Derek");
        assertEquals("Derek",phoneBook.getName(0));
  }
    @Test
    public void AddressCanBeAddedTest(){
        phoneBook.address("7th avenue");
        phoneBook.address("8th avenue");
        assertEquals("7th avenue",phoneBook.getAddress(0));
        assertEquals("8th avenue",phoneBook.getAddress(1));
    }
    @Test
    public void telephoneNumberCanBeAddedTest(){
        phoneBook.phoneNumber("07069052656");
        assertEquals("07069052656",phoneBook.getPhoneNumber(0));
    }
    @Test
    public void emailCanBeAddedTest(){
        phoneBook.email("obuseh@yahoo.com");
        assertEquals("obuseh@yahoo.com",phoneBook.getEmail(0));
    }

}
