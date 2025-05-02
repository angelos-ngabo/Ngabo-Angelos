package Construction;

public class MaterialUsage extends ConstructionMaterial {
    public MaterialUsage(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        super(contractorId, contractorName, materialQuantity, materialBalance);
    }

    @Override
    public void useMaterial() {
        if (materialBalance - materialQuantity < 2) {
            System.out.println("Usage failed: Must keep at least 2 tons after usage.");
            return;
        }

        materialBalance -= materialQuantity;
        System.out.println("Material used successfully.");
        System.out.println("Remaining Material Balance: " + materialBalance + " tons.");
    }

    @Override public void receiveMaterial() {}
    @Override public void estimateCost() {}
}