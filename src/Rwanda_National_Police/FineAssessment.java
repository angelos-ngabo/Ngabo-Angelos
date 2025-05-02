package Rwanda_National_Police;

public class FineAssessment extends TrafficRecord {
    public FineAssessment(String driverId, String driverName, String vehiclePlate, String violationType) {
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
    public void assessFine() {
        switch (violationType) {
            case "SPEEDING":
                fineAmount = 50000;
                break;
            case "RED_LIGHT":
                fineAmount = 80000;
                break;
            case "NO_HELMET":
                fineAmount = 30000;
                break;
            case "DUI":
                fineAmount = 150000;
                break;
        }
        System.out.println("\n=== Fine Assessed ===");
        System.out.println("Violation: " + violationType);
        System.out.println("Amount: " + fineAmount + " RWF");
    }

    @Override
    public void recordViolation() {
        System.out.println("Error: Cannot record violation in FineAssessment class.");
    }

    @Override
    public void processPayment() {
        System.out.println("Error: Cannot process payment in FineAssessment class.");
    }
}