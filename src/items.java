import java.util.ArrayList;

public class items {
    String itemName;
    String itemType;
    double itemPrice;
    private int itemsInInventory;
    int itemID;
    public int getItemID() { return itemID; }
    public void setItemID(int itemID) { this.itemID = itemID; }
    
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    public int getItemsInInventory() {
        return itemsInInventory;
    }

    public void setItemsInInventory(int itemsInInventory) {
        this.itemsInInventory = itemsInInventory;
    }

    items(String itemName, String itemType, double itemPrice) {
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemPrice = itemPrice;
        this.itemID = itemID;
    }

    int amountTransaction = 1;
    double totalPrice;
    public void buyItem()
    {
        if (this.itemID == 1)
        {
            totalPrice = getItemPrice() * amountTransaction;
            setItemsInInventory(itemsInInventory + amountTransaction);
            Smuggler.setMoney(Smuggler.getMoney() + totalPrice);
            System.out.println("You bought a total of" + amountTransaction + " of " + itemName + " !");
        }
        else if (this.itemID == 2)
        {
            totalPrice = getItemPrice() * amountTransaction;
            setItemsInInventory(itemsInInventory + amountTransaction);
            Smuggler.setMoney(Smuggler.getMoney() + totalPrice);
            System.out.println("You bought a total of" + amountTransaction + " of " + itemName + " !");
        }
        else if (this.itemID == 3)
        {
            totalPrice = getItemPrice() * amountTransaction;
            setItemsInInventory(itemsInInventory + amountTransaction);
            Smuggler.setMoney(Smuggler.getMoney() + totalPrice);
            System.out.println("You bought a total of" + amountTransaction + " of " + itemName + " !");
        }
        else if (this.itemID == 4)
        {
            totalPrice = getItemPrice() * amountTransaction;
            setItemsInInventory(itemsInInventory + amountTransaction);
            Smuggler.setMoney(Smuggler.getMoney() + totalPrice);
            System.out.println("You bought a total of" + amountTransaction + " of " + itemName + " !");
        }
        else
        {
            System.out.println("It's sold then. No return policy; I'm sure you understand...");
        }
    }
    public void sellItem()
    {
        if (this.itemID == 1)
        {
            totalPrice = getItemPrice() * amountTransaction;
            setItemsInInventory(itemsInInventory - amountTransaction);
            Smuggler.setMoney(Smuggler.getMoney() - totalPrice);
            System.out.println("You sold a total of" + amountTransaction + " of " + itemName + " !");
        }
        else if (this.itemID == 2)
        {
            totalPrice = getItemPrice() * amountTransaction;
            setItemsInInventory(itemsInInventory - amountTransaction);
            Smuggler.setMoney(Smuggler.getMoney() - totalPrice);
            System.out.println("You sold a total of" + amountTransaction + " of " + itemName + " !");
        }
        else if (this.itemID == 3)
        {
            totalPrice = getItemPrice() * amountTransaction;
            setItemsInInventory(itemsInInventory - amountTransaction);
            Smuggler.setMoney(Smuggler.getMoney() - totalPrice);
            System.out.println("You sold a total of" + amountTransaction + " of " + itemName + " !");
        }
        else if (this.itemID == 4)
        {
            totalPrice = getItemPrice() * amountTransaction;
            setItemsInInventory(itemsInInventory - amountTransaction);
            Smuggler.setMoney(Smuggler.getMoney() - totalPrice);
            System.out.println("You sold a total of" + amountTransaction + " of " + itemName + " !");
        }
        else
        {
            System.out.println("My henchmen will make sure the product is right. Don't forget who you're dealing with on your travels.");
        }
    }
}
