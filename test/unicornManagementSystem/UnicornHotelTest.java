package unicornManagementSystem;

import hotelManagementSystem.UnicornHotel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnicornHotelTest {
    UnicornHotel unicornHotel;
    @BeforeEach
    void startAllTestWith(){
        unicornHotel = new UnicornHotel(5);
    }
    @Test
    void TestThatHotelExist(){
        Assertions.assertNotNull(unicornHotel);
    }
    @Test
    void testThatWeHaveRooms_AndTheyAreEmpty(){
       String[] rooms = unicornHotel.getRooms();
       Assertions.assertNotNull(rooms);
       for (String room : rooms){
          Assertions.assertNull(room);
       }
    }

    @Test
    void testThatRoomCanBeBooked() throws Exception {
        String name = "segun";
       String result = unicornHotel.bookRoom("segun");
       assertNotNull(result);
       assertEquals(name,unicornHotel.getRoomGuest(1));
        String name2 = "Lekan";
        unicornHotel.bookRoom(name2);
        assertEquals(name2,unicornHotel.getRoomGuest(2));
   String name3 ="perry";
   unicornHotel.bookRoom(name3);
   assertEquals(name3,unicornHotel.getRoomGuest(3));
    }
    @Test
 void testCGuestCanCheckOut(){
     assertTrue (UnicornHotel.checkOut(2));

    }
    void testthatRoomCanBeBooked(){

    }
}