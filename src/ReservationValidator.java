import java.util.*;

public class ReservationValidator {

    /**
     * Validates booking input
     */
    public void validate(
            String guestName,
            String roomType,
            RoomInventory inventory
    ) throws InvalidBookingException {

        // Validate guest name
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty");
        }

        // Validate room type (CASE SENSITIVE as per question)
        if (!roomType.equals("Single") &&
                !roomType.equals("Double") &&
                !roomType.equals("Suite")) {
            throw new InvalidBookingException("Invalid room type selected.");
        }

        // Validate availability
        if (!inventory.isAvailable(roomType)) {
            throw new InvalidBookingException("No rooms available for selected type.");
        }
    }
}