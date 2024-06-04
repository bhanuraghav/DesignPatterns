package VendingMachineImplementation;

public class Inventory {

    ItemShelf[] inventory = null;

    Inventory(int itemCount) {
        inventory = new ItemShelf[itemCount];
        initialEmptyInventory();
    }

    private void initialEmptyInventory() {
        int startCode = 101;
        for (int i = 0; i < inventory.length; i++, startCode++) {
            ItemShelf currItem = new ItemShelf();
            currItem.setCode(startCode);
            currItem.setSoldOut(true);
            inventory[i] = currItem;
        }
    }


    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void addItem(Item item, int codeNumber) throws Exception {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getCode() == codeNumber) {
                if (itemShelf.isSoldOut()) {
                    itemShelf.setItem(item);
                    itemShelf.setSoldOut(false);
                } else {
                    throw new Exception("Item Already Present");
                }
            }
        }
    }

    public Item getItem(int codeNumber) throws Exception {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getCode() == codeNumber) {
                if (itemShelf.isSoldOut()) {
                    throw new Exception("Item is sold out");
                } else {
                    return itemShelf.getItem();
                }
            }

        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutItem(int codeNumber) {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getCode() == codeNumber) {
                itemShelf.setSoldOut(true);
            }
        }
    }


}
