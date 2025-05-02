package Construction;

public class CostEstimation extends ConstructionMaterial {
    public CostEstimation(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        super(contractorId, contractorName, materialQuantity, materialBalance);
    }

    @Override
    public void estimateCost() {
        if (materialQuantity < 5) {
            System.out.println("Estimation failed: Quantity must be at least 5 tons.");
            return;
        }

        double costPerTon;
        if (materialQuantity >= 5 && materialQuantity <= 15) {
            costPerTon = 200000;
        } else {
            costPerTon = 180000;
        }

        double totalCost = costPerTon * materialQuantity;
        System.out.println("----- Cost Estimation -----");
        System.out.println("Contractor: " + contractorName + " (ID: " + contractorId + ")");
        System.out.println("Quantity Used: " + materialQuantity + " tons");
        System.out.printf("Total Cost: RWF %,.2f%n", totalCost);
    }

    @Override public void receiveMaterial() {}
    @Override public void useMaterial() {}
}