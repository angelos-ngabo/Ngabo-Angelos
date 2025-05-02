package Rwanda_National_Police;

public class FinePayment extends TrafficRecord {
    public FinePayment(String driverId, String driverName, String vehiclePlate, String violationType, double fineAmount) {
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
        if (fineAmount <= 0) {
            throw new IllegalArgumentException("Fine amount must be positive");
        }

        this.driverId = driverId;
        this.driverName = driverName;
        this.vehiclePlate = vehiclePlate;
        this.violationType = violationType;
        this.fineAmount = fineAmount;
        this.paymentStatus = "UNPAID";
    }

    @Override
    public void processPayment() {
        if (!"UNPAID".equals(paymentStatus)) {
            System.out.println("Error: Payment already processed.");
            return;
        }

        paymentStatus = "PAID";
        System.out.println("\n=== Payment Receipt ===");
        System.out.println("Driver: " + driverName + " (ID: " + driverId + ")");
        System.out.println("Vehicle: " + vehiclePlate);
        System.out.println("Violation: " + violationType);
        System.out.println("Amount Paid: " + fineAmount + " RWF");
        System.out.println("Status: " + paymentStatus);
        System.out.println("Payment processed successfully.");
    }

    @Override
    public void recordViolation() {
        System.out.println("Error: Cannot record violation in FinePayment class.");
    }

    @Override
    public void assessFine() {
        System.out.println("Error: Cannot assess fine in FinePayment class.");
    }
}