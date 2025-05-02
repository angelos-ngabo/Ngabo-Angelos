package Hotel_management_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String guestId = "";
        String guestName = "";
        String roomType = "";
        int stayDays = 0;

        // Input validation for Guest ID
        while (true) {
            System.out.print("Enter Guest ID: ");
            guestId = scanner.nextLine().trim();
            if (!guestId.isEmpty() && guestId.matches("\\d+")) {
                break;
            }
            System.out.println("Error: Guest ID must be numeric and cannot be empty.");
        }

        // Input validation for Guest Name
        while (true) {
            System.out.print("Enter Guest Name: ");
            guestName = scanner.nextLine().trim();
            if (!guestName.isEmpty() && guestName.matches("[a-zA-Z ]+")) {
                break;
            }
            System.out.println("Error: Name must contain only letters and spaces.");
        }

        // Input validation for Room Type
        while (true) {
            System.out.print("Enter Room Type (STANDARD, DELUXE, SUITE): ");
            roomType = scanner.nextLine().trim().toUpperCase();
            if (roomType.matches("STANDARD|DELUXE|SUITE")) {
                break;
            }
            System.out.println("Error: Invalid room type. Please choose from STANDARD, DELUXE, or SUITE.");
        }

        // Input validation for Stay Duration
        while (true) {
            System.out.print("Enter Stay Duration (1-30 days): ");
            if (scanner.hasNextInt()) {
                stayDays = scanner.nextInt();
                if (stayDays >= 1 && stayDays <= 30) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Error: Stay duration must be between 1 and 30 days.");
        }
        scanner.nextLine(); // Consume newline

        // Room Booking
        RoomBooking roomBooking = new RoomBooking(guestId, guestName, roomType, stayDays);
        roomBooking.bookRoom();

        // Checkout Process
        System.out.print("\nPress Enter to proceed to checkout...");
        scanner.nextLine();
        GuestCheckout guestCheckout = new GuestCheckout(guestId, guestName, roomType, stayDays);
        guestCheckout.roomStatus = roomBooking.roomStatus;
        guestCheckout.checkoutGuest();

        // Billing Process
        System.out.print("\nPress Enter to generate bill...");
        scanner.nextLine();
        Billing billing = new Billing(guestId, guestName, roomType, stayDays);
        billing.generateBill();

        scanner.close();
    }
}