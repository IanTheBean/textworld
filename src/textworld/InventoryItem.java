package textworld;

public class InventoryItem {
    //TODO set a max amount and make sure we don't exceed it
    private String name;
    private int amount;

    public InventoryItem(String name, int amount){
        this.name = name;
        this.amount = amount;
    }

    public void addAmount(int amount){
        this.amount += amount;
    }

    public void removeAmount(int amount){
        this.amount -= amount;
    }

    public int getAmount(){
        return this.amount;
    }

    public String getName(){
        return this.name;
    }
}
