package textworld;

public class ToolRecipe {
    private String[] ingredients;
    private int[] amounts;
    private InventoryTool result;

    public ToolRecipe(InventoryTool result, String[] ingredients, int[] amounts){
        this.result = result;
        this.ingredients = ingredients;
        this.amounts = amounts;
    }

    public String[] getIngredients(){
        return ingredients;
    }

    public int[] getIngredientAmount(){
        return amounts;
    }

    public InventoryTool getResult(){
        return result;
    }
}
