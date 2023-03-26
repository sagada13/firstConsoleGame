public class Smuggler {
    public static double money;
    private int currentFine;
    private int itemsInInventory;
    private double riskFactor;


    public Smuggler(double riskFactor) {
        this.riskFactor = riskFactor;
    }

    public Smuggler() {

    }

    public double getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(double riskFactor) {
        this.riskFactor = riskFactor;
    }

    public static double getMoney() {
        return money;
    }

    public static void setMoney(double money) {
        Smuggler.money = money;
    }

    public int getCurrentFine() {
        return currentFine;
    }

    public void setCurrentFine(int currentFine) {
        this.currentFine = currentFine;
    }

    public int getItemsInInventory() { return itemsInInventory; }

    public void setItemsInInventory(int itemsInInventory) { this.itemsInInventory = itemsInInventory; }

    Smuggler(double money, int currentFine, int itemsInInventory) {
        this.money = money;
        this.currentFine = currentFine;
        this.itemsInInventory = itemsInInventory;
    }


    public void gettingCock() {
        int bustedCount = 0;
        currentFine = 100;
        riskFactor = itemsInInventory * 2;
        int min_num = 0;
        int max_num = 100;
        double gettingCock = Math.random() * (max_num - min_num);
        if (riskFactor <= gettingCock) {
            System.out.println("The border patrol caught you! Time to pay a fine and have your goods seized");
            bustedCount++;
            money = money - currentFine;
            currentFine = currentFine + 50;
            if (money <= 0) {
                System.out.println("Looks like you ran out of money. Game over. Better luck next time!");
            }
        } else {
            System.out.println("Welcome to your destination");
        }
    }
}