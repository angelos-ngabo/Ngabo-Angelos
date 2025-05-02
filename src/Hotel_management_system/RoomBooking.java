package Hotel_management_system;

public class RoomBooking extends HotelService {
    public RoomBooking(String guestId, String guestName, String roomType, int stayDays) {
        super(guestId, guestName, roomType, stayDays);
    }

    @Override
    public void bookRoom() {
        if (!roomStatus.equals("AVAILABLE")) {
            System.out.println("Error: Room is not available for booking.");
            return;
        }

        roomStatus = "OCCUPIED";
        System.out.println("\nBooking Confirmation:");
        System.out.println("Guest: " + guestName + " (ID: " + guestId + ")");
        System.out.println("Room Type: " + roomType);
        System.out.println("Duration: " + stayDays + " days");
        System.out.println("Status: " + roomStatus);
    }

    @Override
    public void checkoutGuest() {
        System.out.println("Error: Checkout not available during booking.");
    }

    @Override
    public void generateBill() {
        System.out.println("Error: Billing not available during booking.");
    }
}