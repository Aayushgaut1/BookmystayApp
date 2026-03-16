/**
 * =========================================================
 * MAIN CLASS - UseCaseHotelBookingApp
 * =========================================================
 *
 * UC1: Application Entry & Welcome Message
 * UC2: Basic Room Types & Static Availability
 *
 * @version 2.1
 */

public class UseCaseHotelBookingApp {

    public static void main(String[] args) {

        /* ---------------- UC1 ---------------- */

        System.out.println("==============================================");
        System.out.println("Welcome to the Hotel Booking Management System");
        System.out.println("Book My Stay App - Version 2.1");
        System.out.println("==============================================");

        System.out.println("System initialized successfully.\n");


        /* ---------------- UC2 ---------------- */

        System.out.println("Hotel Room Initialization\n");

        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("Single Room:");
        singleRoom.displayRoomDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println("\nDouble Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable);

        System.out.println("\nSuite Room:");
        suiteRoom.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}