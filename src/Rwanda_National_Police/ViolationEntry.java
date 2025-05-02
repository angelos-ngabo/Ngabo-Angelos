package Rwanda_National_Police;

public class ViolationEntry extends TrafficRecord {
    public ViolationEntry(String driverId, String driverName, String vehiclePlate, String violationType) {
        if (!isValidDriverId(driverId)) {
            throw new IllegalArgumentException("Invalid driver ID");
        }
        if (!isValidDriverName(driverName)) {
            throw new IllegalArgumentException("Invalid driver name");
        }
        if (!isValidVehiclePlate(vehiclePlate)) {
            throw new IllegalArgumentException("Invalid vehicle plate");
        }
        if (!isValidViolationType(violationType)) {
            throw new IllegalArgumentException("Invalid violation type");
        }

        this.driverId = driverId;
        this.driverName = driverName;
        this.vehiclePlate = vehiclePlate;
        this.violationType = violationType;
        this.paymentStatus = "UNPAID";
    }

    @Override
    public void recordViolation() {
        System.out.println("\n=== Violation Recorded ===");
        System.out.println("Driver: " + driverName + " (ID: " + driverId + ")");
        System.out.println("Vehicle: " + vehiclePlate);
        System.out.println("Violation: " + violationType);
        System.out.println("Status: " + paymentStatus);
    }

    @Override
    public void assessFine() {
        System.out.println("Error: Cannot assess fine in ViolationEntry class.");
    }

    @Override
    public void processPayment() {
        System.out.println("Error: Cannot process payment in ViolationEntry class.");
    }
}