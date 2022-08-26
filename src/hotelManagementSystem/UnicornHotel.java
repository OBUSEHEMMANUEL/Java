package hotelManagementSystem;

public class UnicornHotel {
    private static String[] rooms;

    public UnicornHotel(int numberOfRoom) {
        this.rooms = new String[numberOfRoom];

    }

    public String bookRoom(String name) throws Exception {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = name;
                break;
            }
        }
        return "Room booked Sucessfully";

    }

    public String getRoomGuest(int roomNumber) {
        return rooms[roomNumber - 1];
    }

    public String[] getRooms() {
        return rooms;
    }


    public static boolean checkOut(int roomNUmber) {
        boolean result = false;
        rooms[roomNUmber-1] = null;
        if (rooms[roomNUmber-1] == null) {
            result = true;
        }
        return true;
    }
}