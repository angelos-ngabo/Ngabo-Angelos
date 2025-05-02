package Hotel_management_system;

public class Billing extends HotelService {
    public Billing(String guestId, String guestName, String roomType, int stayDays) {
        super(guestId, guestName, roomType, stayDays);
    }

    @Override
    public void generateBill() {
        if (!roomStatus.equals("AVAILABLE")) {
            System.out.println("Error: Cannot generate bill for an occupied room.");
            return;
        }

        int costPerNight;
        switch (roomType) {
            case "STANDARD":
                costPerNight = 50000;
                break;
            case "DELUXE":
                costPerNight = 80000;
                break;
            case "SUITE":
                costPerNight = 120000;
                break;
            default:
                System.out.println("Error: Invalid room type for billing.");
                return;
        }

        int totalCost = costPerNight * stayDays;
        System.out.println("\n=== Final Bill ===");
        System.out.println("Guest: " + guestName + " (ID: " + guestId + ")");
        System.out.println("Room Type: " + roomType);
        System.out.println("Duration: " + stayDays + " nights");
        System.out.println("Rate per night: " + costPerNight + " IDR");
        System.out.println("Total Amount Due: " + totalCost + " IDR");
        System.out.println("Thank you for your stay!");
    }

    @Override
    public void bookRoom() {
        System.out.println("Error: Booking not available during billing.");
    }

    @Override
    public void checkoutGuest() {
        System.out.println("Error: Checkout not available during billing.");
    }
}