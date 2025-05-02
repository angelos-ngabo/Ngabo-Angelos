package Rwanda_National_Police;

import java.util.Scanner;

public class TrafficFineManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String driverId = "";
        String driverName = "";
        String vehiclePlate = "";
        String violationType = "";

        // Input validation for Driver ID
        while (true) {
            System.out.print("Enter Driver ID (16 digits): ");
            driverId = scanner.nextLine().trim();
            if (driverId.matches("\\d{16}")) {
                break;
            }
            System.out.println("Error: Driver ID must be exactly 16 digits.");
        }

        // Input validation for Driver Name
        while (true) {
            System.out.print("Enter Driver Name: ");
            driverName = scanner.nextLine().trim();
            if (!driverName.isEmpty() && driverName.matches("[a-zA-Z ]+")) {
                break;
            }
            System.out.println("Error: Name must contain only letters and spaces.");
        }

        // Input validation for Vehicle Plate
        while (true) {
            System.out.print("Enter Vehicle Plate (format: RAB123D): ");
            vehiclePlate = scanner.nextLine().trim().toUpperCase();
            if (vehiclePlate.matches("R[A-Z]{2}\\d{3}[A-Z]")) {
                break;
            }
            System.out.println("Error: Plate must follow format RAB123D (e.g., RAB123D).");
        }

        // Input validation for Violation Type
        while (true) {
            System.out.print("Enter Violation Type (SPEEDING, RED_LIGHT, NO_HELMET, DUI): ");
            violationType = scanner.nextLine().trim().toUpperCase();
            if (violationType.matches("SPEEDING|RED_LIGHT|NO_HELMET|DUI")) {
                break;
            }
            System.out.println("Error: Invalid violation type. Choose from SPEEDING, RED_LIGHT, NO_HELMET, or DUI.");
        }

        // Process violation
        ViolationEntry violationEntry = new ViolationEntry(driverId, driverName, vehiclePlate, violationType);
        violationEntry.recordViolation();

        // Assess fine
        FineAssessment fineAssessment = new FineAssessment(driverId, driverName, vehiclePlate, violationType);
        fineAssessment.assessFine();

        // Process payment
        FinePayment finePayment = new FinePayment(driverId, driverName, vehiclePlate, violationType, fineAssessment.fineAmount);
        System.out.print("\nProceed with payment? (Y/N): ");
        String confirm = scanner.nextLine().trim().toUpperCase();
        if (confirm.equals("Y")) {
            finePayment.processPayment();
        } else {
            System.out.println("Payment cancelled. Fine remains unpaid.");
        }

        scanner.close();
    }
}