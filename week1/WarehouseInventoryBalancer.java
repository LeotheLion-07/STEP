public class WarehouseInventoryBalancer {

    // Method to analyze inventory
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {

        if (sectionA.length != sectionB.length) {
            System.out.println("Error: Both arrays must be of equal length.");
            return;
        }

        int totalA = 0;
        int totalB = 0;

        int highestQuantity = Integer.MIN_VALUE;
        String highestSection = "";
        int highestIndex = -1;
        
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];

            if (sectionA[i] > highestQuantity) {
                highestQuantity = sectionA[i];
                highestSection = "Section A";
                highestIndex = i;
            }
        }
        
        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];

            if (sectionB[i] > highestQuantity) {
                highestQuantity = sectionB[i];
                highestSection = "Section B";
                highestIndex = i;
            }
        }
        
        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);

        if (totalA == totalB) {
            System.out.println("Status: Balanced");
        } else {
            System.out.println("Status: Not Balanced");
        }
        
        System.out.println("Highest Quantity: " + highestQuantity + " (" + "Section " + highestSection + " Item " + highestIndex + ")");
    }

    public static void main(String[] args) {
        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        analyzeInventory(sectionA, sectionB);
    }
}
