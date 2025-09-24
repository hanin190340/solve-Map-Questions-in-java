import java.util.HashMap;
import java.util.Map;

class InventoryManager {
    private Map<String, Integer> inventory = new HashMap<>();

    public InventoryManager() {
        inventory.put("Apples", 50);
        inventory.put("Oranges", 30);
    }

    public void restockItem(String itemName, int quantityToAdd) {
        if (inventory.containsKey(itemName)) {
            inventory.put(itemName, inventory.get(itemName) + quantityToAdd);

        } else {
            inventory.put(itemName, quantityToAdd);

        }
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }
}