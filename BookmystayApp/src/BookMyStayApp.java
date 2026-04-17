public class BookMyStayApp {

    public static void main(String[] args) {

        /* ---------------- UC1 ---------------- */
        System.out.println("==============================================");
        System.out.println("Welcome to the Hotel Booking Management System");
        System.out.println("Book My Stay App - Version 3.1");
        System.out.println("==============================================");
        System.out.println("System initialized successfully.\n");

        /* ---------------- UC2 + UC3 ---------------- */
        System.out.println("Hotel Room Initialization\n");

        // Room objects (Domain)
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Centralized inventory (State)
        RoomInventory inventory = new RoomInventory();

        System.out.println("Single Room:");
        singleRoom.displayRoomDetails();
        System.out.println("Available: " +
                inventory.getRoomAvailability().get("Single"));

        System.out.println("\nDouble Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " +
                inventory.getRoomAvailability().get("Double"));

        System.out.println("\nSuite Room:");
        suiteRoom.displayRoomDetails();
        System.out.println("Available: " +
                inventory.getRoomAvailability().get("Suite"));
    }
}