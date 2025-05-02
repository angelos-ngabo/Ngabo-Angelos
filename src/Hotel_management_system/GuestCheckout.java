package Hotel_management_system;

public class GuestCheckout extends HotelService {
    public GuestCheckout(String guestId, String guestName, String roomType, int stayDays) {
        super(guestId, guestName, roomType, stayDays);
    }

    @Override
    public void checkoutGuest() {
        if (guestId == null || guestId.isEmpty()) {
            System.out.println("Error: Invalid guest ID.");
            return;
        }

        if (!roomStatus.equals("OCCUPIED")) {
            System.out.println("Error: Cannot checkout. Room is not currently occupied.");
            return;
        }

        roomStatus = "AVAILABLE";
        System.out.println("Checkout successful for " + guestName + " (ID: " + guestId + ").");
        System.out.println("Room " + roomType + " is now available.");
    }

    @Override
    public void bookRoom() {
        System.out.println("Error: Booking not available during checkout.");
    }

    @Override
    public void generateBill() {
        System.out.println("Error: Please use Billing class to generate bill.");
    }
}