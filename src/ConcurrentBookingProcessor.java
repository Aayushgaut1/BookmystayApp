public class ConcurrentBookingProcessor implements Runnable {

    /**
     * Shared booking request queue.
     */
    private BookingRequestQueue bookingQueue;

    /**
     * Shared room inventory.
     */
    private RoomInventory inventory;

    /**
     * Shared allocation service.
     */
    private RoomAllocationService allocationService;

    /**
     * Constructor
     */
    public ConcurrentBookingProcessor(
            BookingRequestQueue bookingQueue,
            RoomInventory inventory,
            RoomAllocationService allocationService
    ) {
        this.bookingQueue = bookingQueue;
        this.inventory = inventory;
        this.allocationService = allocationService;
    }

    /**
     * Thread execution logic
     */
    @Override
    public void run() {

        while (true) {

            Reservation reservation;

            // 🔒 Synchronize queue access
            synchronized (bookingQueue) {

                if (bookingQueue.isEmpty()) {
                    break; // stop thread
                }

                reservation = bookingQueue.getNextRequest();
            }

            // 🔒 Synchronize inventory (critical section)
            synchronized (inventory) {
                allocationService.allocateRoom(reservation, inventory);
            }
        }
    }
}