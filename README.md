# Ngabo-Angelos
This is OOP assignment One
# Project Portfolio: Java Applications for Various Domains

This repository contains a collection of Java applications designed for different domains including construction management, hotel management, and traffic fine management systems.

## Table of Contents
1. [Construction Management System](#construction-management-system)
2. [Hotel Management System](#hotel-management-system)
3. [Traffic Fine Management System](#traffic-fine-management-system)
4. [Installation](#installation)
5. [Usage](#usage)
6. [Contributing](#contributing)
7. [License](#license)

## Construction Management System

### Overview
A Java application for managing construction materials, tracking usage, and estimating costs.

### Features
- Material delivery tracking with quantity validation (1-10 tons)
- Material usage monitoring with minimum balance requirement (2 tons)
- Cost estimation with tiered pricing (5-15 tons and 15+ tons)
- Input validation for all user entries

### Classes
- `ConstructionMaterial.java` - Abstract base class
- `MaterialDelivery.java` - Handles material deliveries
- `MaterialUsage.java` - Manages material usage
- `CostEstimation.java` - Calculates project costs
- `RealConstructorSystem.java` - Main application class

## Hotel Management System

### Overview
A comprehensive hotel management solution for room booking, guest checkout, and billing.

### Features
- Room booking with status tracking (AVAILABLE/OCCUPIED)
- Guest checkout with status validation
- Automated billing based on room type and stay duration
- Input validation for guest information and room types

### Classes
- `HotelService.java` - Abstract base class
- `RoomBooking.java` - Handles room reservations
- `GuestCheckout.java` - Manages guest departures
- `Billing.java` - Generates payment bills
- `Main.java` - Main application class

## Traffic Fine Management System

### Overview
A system for recording traffic violations, assessing fines, and processing payments.

### Features
- Violation recording with type validation
- Automated fine assessment based on violation type
- Payment processing with receipt generation
- Comprehensive input validation (driver ID, license plate, etc.)

### Classes
- `TrafficRecord.java` - Abstract base class
- `ViolationEntry.java` - Records traffic violations
- `FineAssessment.java` - Calculates fine amounts
- `FinePayment.java` - Processes payments
- `TrafficFineManagementSystem.java` - Main application class

