package VendingMachineImplementation;

public class Item {
    ItemType type;
    int price;

    public int getPrice() {
        return price;
    }

    public ItemType getType() {
        return type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(ItemType type) {
        this.type = type;
    }
}
