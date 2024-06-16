public class Item {
    private int itemID;
    private String itemName;
    public Item(int itemID, String itemName) {
        this.itemID = itemID;
        this.itemName = itemName;
    }
    public void show(){
        System.out.println(itemName);
    }
    public int getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }
}
