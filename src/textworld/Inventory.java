package textworld;

import java.util.Arrays;

public class Inventory {
    private InventoryItem[] items = new InventoryItem[0];
    private InventoryTool[] tools = new InventoryTool[0];

    public Inventory(){
    }

    public void addItem(String name, int amount){
        if(this.hasItem(name) != 0){
            this.getItem(name).addAmount(amount);
        }else{
            this.addToEnd(new InventoryItem(name, amount));
        }
    }

    public void addTool(InventoryTool tool){
        this.addToEnd(tool);
    }

    private void deleteItem(String name){
        InventoryItem[] copy = new InventoryItem[this.items.length - 1];

        for (int i = 0, j = 0; i < this.items.length; i++) {
            if (items[i].getName() != name) {
                copy[j++] = items[i];
            }
        }
        this.items = copy;
    }

    public void removeItem(String name, int amount){
        if(this.hasItem(name) != 0){
            this.getItem(name).removeAmount(amount);
        }
        if(this.hasItem(name) == 0){
            deleteItem(name);
        }
        //TODO throw error if we subtract more than we have
    }

    public int hasItem(String item){
        for (InventoryItem inventoryItem : this.items) {
            if (inventoryItem.getName() == item) {
                return inventoryItem.getAmount();
            }
        }
        return 0;
    }

    public InventoryTool hasTool(String type, int durability){
        for (InventoryTool tool : this.tools) {
            if(tool.getType().equals(type) && tool.getDurability() >= durability){
                return tool;
            }
        }
        return null;
    }

    private InventoryItem getItem(String name){
        for (InventoryItem item : this.items) {
            if (item.getName() == name) {
                return item;
            }
        }
        return null;
    }

    private void addToEnd(InventoryItem item){
        this.items = Arrays.copyOf(this.items, this.items.length + 1);
        this.items[this.items.length - 1] = item;
    }

    private void addToEnd(InventoryTool tool){
        this.tools = Arrays.copyOf(this.tools, this.tools.length + 1);
        this.tools[this.tools.length - 1] = tool;
    }

    public String render() {
        String output = "";
        for (int i = 0; i < this.tools.length;i++) {
            output += "- " + tools[i].getName();
            if(i != tools.length - 1){
                output += "\n";
            }
        }

        for (int i = 0; i < this.items.length;i++) {
            output += (items[i].getAmount() + " " + items[i].getName());
            if(i != items.length - 1){
                output += "\n";
            }
        }
        return output;
    }
}
