import java.util.List;

public class BookingReportService {

    /**
     * Generate booking report
     */
    public void generateReport(BookingHistory history) {

        System.out.println("\nBooking History Report\n");

        List<Reservation> reservations = history.getConfirmedReservations();

        for (Reservation r : reservations) {
            System.out.println("Guest: " + r.getGuestName()
                    + ", Room Type: " + r.getRoomType());
        }
    }
}