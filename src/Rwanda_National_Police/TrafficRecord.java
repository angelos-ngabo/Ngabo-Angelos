package Rwanda_National_Police;

public abstract class TrafficRecord {
    protected String driverId;        // National ID or driving license number
    protected String driverName;      // Driver's full name
    protected String vehiclePlate;    // Vehicle registration plate
    protected String violationType;   // Type of violation
    protected double fineAmount;      // Amount of the fine
    protected String paymentStatus;   // Payment status ("UNPAID" or "PAID")

    public abstract void recordViolation();
    public abstract void assessFine();
    public abstract void processPayment();

    protected boolean isValidDriverId(String id) {
        return id != null && id.matches("\\d{16}");
    }

    protected boolean isValidDriverName(String name) {
        return name != null && !name.trim().isEmpty() && name.matches("[a-zA-Z ]+");
    }

    protected boolean isValidVehiclePlate(String plate) {
        return plate != null && plate.matches("R[A-Z]{2}\\d{3}[A-Z]");
    }

    protected boolean isValidViolationType(String violation) {
        return violation != null && violation.matches("SPEEDING|RED_LIGHT|NO_HELMET|DUI");
    }
}