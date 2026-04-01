import java.util.LinkedList;
import java.util.Queue;

public class UseCase6RoomAllocation {

    public static void main(String[] args) {

        System.out.println("Room Allocation Processing...\n");

        // Queue for FIFO booking requests
        Queue<Reservation> bookingQueue = new LinkedList<>();

        bookingQueue.add(new Reservation("Abhi", "Single"));
        bookingQueue.add(new Reservation("Subha", "Single"));
        bookingQueue.add(new Reservation("Vanmathi", "Suite"));

        RoomInventory inventory = new RoomInventory();
        RoomAllocationService service = new RoomAllocationService();

        // Process queue
        while (!bookingQueue.isEmpty()) {
            Reservation reservation = bookingQueue.poll();
            service.allocateRoom(reservation, inventory);
        }
    }
}