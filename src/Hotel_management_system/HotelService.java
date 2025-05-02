package Hotel_management_system;

public abstract class HotelService {
    protected String guestId;
    protected String guestName;
    protected String roomType;
    protected int stayDays;
    protected String roomStatus;

    public HotelService(String guestId, String guestName, String roomType, int stayDays) {
        if (guestId == null || guestId.isEmpty()) {
            throw new IllegalArgumentException("Guest ID cannot be null or empty");
        }
        if (guestName == null || guestName.isEmpty()) {
            throw new IllegalArgumentException("Guest name cannot be null or empty");
        }
        if (stayDays < 1 || stayDays > 30) {
            throw new IllegalArgumentException("Stay days must be between 1 and 30");
        }

        this.guestId = guestId;
        this.guestName = guestName;
        this.roomType = roomType.toUpperCase();
        this.stayDays = stayDays;
        this.roomStatus = "AVAILABLE";
    }

    public abstract void bookRoom();
    public abstract void checkoutGuest();
    public abstract void generateBill();
}