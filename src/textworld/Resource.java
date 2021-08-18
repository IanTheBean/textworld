package textworld;

import java.util.Random;

public class Resource {
    private String name;
    private String loot;
    private Random random;
    private int toughness;
    private String type;
    private String[] sight;
    private String[] sound;
    private String[] smell;

    public Resource(String name, String loot,String type, int toughness, String[] adjectives){
        this.name = name;
        this.loot = loot;
        this.random = new Random();
        this.type = type;
        this.toughness = toughness;
    }

    public String getName(){
        return name;
    }

    public String getLoot(){
        return loot;
    }

    public String harvest(){
        if(this.type.equals("any") ||this.toughness == 0) {
            Main.player.getInventory().addItem(loot, 1);
            return "hands";
        }

        InventoryTool tool = Main.player.getInventory().hasTool(this.type, this.toughness);
        if(tool != null) {
            Main.player.getInventory().addItem(loot, 1);
            return tool.getName();
        }else{
            return null;
        }
    }

    public String render(String sense){
        if(sense.equals("smell")){
            return smell[random.nextInt(smell.length)];
        }else if(sense.equals("sight")){
            return sight[random.nextInt(sight.length)];
        } if(sense.equals("sound")){
            return sound[random.nextInt(sound.length)];
        }
        return "";
    }
}
