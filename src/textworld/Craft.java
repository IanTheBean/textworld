package textworld;

import javax.tools.Tool;

public class Craft {
    private ToolRecipe[] toolRecipes;

    public Craft(ToolRecipe[] toolRecipes){
        this.toolRecipes = toolRecipes;
    }

    public InventoryTool craft(String name){
        ToolRecipe recipe = hasRecipe(name);
        if(recipe != null){
            String[] ingredients = recipe.getIngredients();
            int[] amounts = recipe.getIngredientAmount();
            boolean canCraft = true;
            for(int i = 0; i < ingredients.length;i++){
                if(Main.player.getInventory().hasItem(ingredients[i]) < amounts[i]){
                    return null;
                }
            }
            for(int i = 0; i < ingredients.length;i++){
                Main.player.getInventory().removeItem(ingredients[i], amounts[i]);
            }
            return recipe.getResult();
        }
        return null;
    }

    public ToolRecipe hasRecipe(String name){
        for(ToolRecipe toolRecipe : this.toolRecipes){
            if(toolRecipe.getResult().getName().equals(name)){
                return toolRecipe;
            }
        }
        return null;
    }
}
