package textworld;

public class InventoryTool {
    private String name;
    private String type;
    private int durability;

    public InventoryTool(String name, String type, int durability){
        this.name = name;
        this.type = type;
        this.durability = durability;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public int getDurability(){
        return this.durability;
    }
}
