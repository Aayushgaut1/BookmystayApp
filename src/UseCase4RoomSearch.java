/**
 * =========================================================
 * MAIN CLASS - UseCase4RoomSearch
 * =========================================================
 *
 * Use Case 4: Room Search & Availability Check
 *
 * Demonstrates how guests can search for
 * available rooms without modifying inventory.
 *
 * @version 4.0
 */
public class UseCase4RoomSearch {

    public static void main(String[] args) {

        System.out.println("Room Search\n");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Initialize room domain objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Initialize search service
        RoomSearchService searchService = new RoomSearchService();

        // Perform search
        searchService.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
    }
}
