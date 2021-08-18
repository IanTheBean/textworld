package textworld;

public class Processor {
    //see commands list for all commands

    public void run (String command, String arg){
        if(command.equals("inventory")) {
            Main.renderer.inventory();
        }else if(command.equals("move")) {
            if (arg.equals("north")) {
                int[] move = new int[]{0, 1};
                Main.player.move(move);
                Main.renderer.move(move);
            } else if (arg.equals("south")) {
                int[] move = new int[]{0, -1};
                Main.player.move(move);
                Main.renderer.move(move);
            } else if (arg.equals("east")) {
                int[] move = new int[]{1, 0};
                Main.player.move(move);
                Main.renderer.move(move);
            } else if (arg.equals("west")) {
                int[] move = new int[]{-1, 0};
                Main.player.move(move);
                Main.renderer.move(move);
            }else{
                Main.renderer.error();
            }
        }else if(command.equals("harvest")){
            int[] position = Main.player.getPosition();
            Resource resource = null;
            if(resource == null){
                Main.renderer.harvestError(arg);
            }else{
                String tool = resource.harvest();
                if(tool == null){
                    Main.renderer.cantHarvest(resource);
                }else{
                    Main.renderer.harvest(tool, resource, 1);
                }
            }
        }else if(command.equals("craft")){
            InventoryTool tool = Main.craft.craft(arg);
            if(tool != null){
                Main.player.getInventory().addTool(tool);
                Main.renderer.craft(arg);
            }else {
                ToolRecipe recipe = Main.craft.hasRecipe(arg);
                if(recipe != null) {
                    String fullRecipe = "";
                    String[] ingredients = recipe.getIngredients();
                    int[] amounts = recipe.getIngredientAmount();
                    for (int i = 0; i < amounts.length;i++) {
                        fullRecipe += amounts[i] + " " + ingredients[i] + "\n";
                    }
                    Main.renderer.cantCraft(arg, fullRecipe);
                }else{
                    Main.renderer.craftError(arg);
                }
            }
        }else if(command.equals("help")){
            //TODO give them all the commands
        }else if(command.equals("quit")){
            Main.renderer.quit();
        }else{
            Main.renderer.error();
        }

    }
}
