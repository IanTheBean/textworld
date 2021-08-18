package textworld;

public class Main {
    //public static Player player = new Player(3, 3);
//
    ////public static Resource tree = new Resource("tree", "wood", "axe", 0, new String[]{"green", "towering", "dark"});
    ////public static Resource rock = new Resource("rock", "rock", "pick", 1, new String[]{"gray", "hard", "mossy"});
    ////public static Resource log = new Resource("log", "wood", "axe", 0, new String[]{"hollow", "rotting"});
    ////public static Resource mushroom = new Resource("mushroom", "mushroom", "any", 0, new String[]{"small", "magical", "brown"});
    ////public static Resource cactus = new Resource("cactus", "cactus", "any", 0, new String[]{"green", "prickly", "funny looking"});
    ////public static Resource coal = new Resource("charcoal", "charcoal", "pick", 1, new String[]{"black", "sooty", "dust covered"});
    ////public static Resource crystal = new Resource("crystal", "iron", "pick", 2, new String[]{"bright", "reflective", "pink"});
    ////public static Resource stalagmite = new Resource("stalagmites", "rock","pick", 1, new String[]{"pointy", "tall", "ornate"});
//
    //public static Biome forest = new Biome("forest", new String[]{"foggy", "light deprived"}, new Resource[]{tree, rock, log, mushroom});
    //public static Biome desert = new Biome("desert", new String[]{"sandy", "dry", "hot"}, new Resource[]{rock, cactus});
    //public static Biome cave = new Biome("cave", new String[]{"dark", "vast", "spacious"}, new Resource[]{coal, crystal, stalagmite});
//
    //private static final WorldGenerator worldGenerator = new WorldGenerator(5, new Biome[]{forest, cave, desert});
    //public static Biome[][] world = worldGenerator.generate();
//
    //public static InventoryTool woodpick = new InventoryTool("wooden pick", "pick", 1);
    //public static InventoryTool rockpick = new InventoryTool("stone pick", "pick", 2);
    //public static InventoryTool ironpick = new InventoryTool("iron pick", "pick", 3);
//
    //public static ToolRecipe woodpickRecipe = new ToolRecipe(woodpick, new String[]{"wood"}, new int[]{3});
    //public static ToolRecipe stonepickRecipe = new ToolRecipe(rockpick, new String[]{"wood", "rock"}, new int[]{1, 2});
    //public static ToolRecipe ironpickRecipe = new ToolRecipe(ironpick, new String[]{"wood", "iron"}, new int[]{1, 2});
//
    //public static Craft craft = new Craft(new ToolRecipe[]{woodpickRecipe, stonepickRecipe, ironpickRecipe});
//
    //public static Renderer renderer = new Renderer();
    //public static Processor processor = new Processor();

    public static void main(String[] args){
        //renderer.start();
        System.out.println(Grammar.getSentenceTemplate(2));
    }
}
