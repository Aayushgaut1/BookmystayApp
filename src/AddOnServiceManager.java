import java.util.*;

public class AddOnServiceManager {

    /**
     * Maps reservation ID to selected services.
     * Key   -> Reservation ID
     * Value -> List of selected services
     */
    private Map<String, List<AddOnService>> servicesByReservation;

    /**
     * Constructor
     */
    public AddOnServiceManager() {
        servicesByReservation = new HashMap<>();
    }

    /**
     * Add service to reservation
     */
    public void addService(String reservationId, AddOnService service) {

        servicesByReservation.putIfAbsent(reservationId, new ArrayList<>());
        servicesByReservation.get(reservationId).add(service);
    }

    /**
     * Calculate total cost
     */
    public double calculateTotalServiceCost(String reservationId) {

        double total = 0.0;

        List<AddOnService> services = servicesByReservation.get(reservationId);

        if (services != null) {
            for (AddOnService service : services) {
                total += service.getCost();
            }
        }

        return total;
    }
}