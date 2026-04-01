public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        System.out.println("Booking Cancellation\n");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Cancellation service
        CancellationService service = new CancellationService();

        // Simulate confirmed booking
        String reservationId = "Single-1";
        service.registerBooking(reservationId, "Single");

        // Cancel booking
        service.cancelBooking(reservationId, inventory);

        // Show rollback history
        service.showRollbackHistory();

        // Show updated inventory
        System.out.println("\nUpdated Single Room Availability: "
                + inventory.getAvailableRooms("Single"));
    }
}