package VendingMachineImplementation;

public class ItemShelf {

    Item item;
    int code;
    boolean isSoldOut;

    public int getCode() {
        return code;
    }

    public Item getItem() {
        return item;
    }

    public boolean isSoldOut() {
        return isSoldOut;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setSoldOut(boolean soldOut) {
        this.isSoldOut = soldOut;
    }
}
