import java.util.*;

public class RoomAllocationService {

    // Stores all allocated room IDs
    private Set<String> allocatedRoomIds;

    // Stores room IDs grouped by type
    private Map<String, Set<String>> assignedRoomsByType;

    // Counter for unique ID generation
    private Map<String, Integer> roomCounters;

    public RoomAllocationService() {
        allocatedRoomIds = new HashSet<>();
        assignedRoomsByType = new HashMap<>();
        roomCounters = new HashMap<>();
    }

    // Allocate room safely
    public void allocateRoom(Reservation reservation, RoomInventory inventory) {

        String roomType = reservation.getRoomType();

        // Check availability
        if (!inventory.isAvailable(roomType)) {
            System.out.println("No rooms available for type: " + roomType);
            return;
        }

        // Generate unique room ID
        String roomId = generateRoomId(roomType);

        // Store globally
        allocatedRoomIds.add(roomId);

        // Store by type
        assignedRoomsByType.putIfAbsent(roomType, new HashSet<>());
        assignedRoomsByType.get(roomType).add(roomId);

        // Update inventory immediately
        inventory.decrementRoom(roomType);

        // Confirm booking
        System.out.println("Booking confirmed for Guest: " +
                reservation.getGuestName() + ", Room ID: " + roomId);
    }

    // Generate unique room ID
    private String generateRoomId(String roomType) {
        int count = roomCounters.getOrDefault(roomType, 0) + 1;
        roomCounters.put(roomType, count);

        return roomType + "-" + count;
    }
}