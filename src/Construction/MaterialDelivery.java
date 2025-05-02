package Construction;

public class MaterialDelivery extends ConstructionMaterial {
    public MaterialDelivery(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        super(contractorId, contractorName, materialQuantity, materialBalance);
    }

    @Override
    public void receiveMaterial() {
        if (materialQuantity < 1 || materialQuantity > 10) {
            System.out.println("Delivery failed: Quantity must be between 1 and 10 tons.");
            return;
        }

        materialBalance += materialQuantity;
        System.out.println("Material delivered successfully.");
        System.out.println("Updated Material Balance: " + materialBalance + " tons.");
    }

    @Override public void useMaterial() {}
    @Override public void estimateCost() {}
}