package textworld;

public class Player {
    private int health;
    private Inventory inventory;
    private int[] position;

    public Player(int x, int y){
        this.health = 16;
        this.inventory = new Inventory();
        this.position = new int[]{x, y};
    }
    public Inventory getInventory(){
        return inventory;
    }
    public int getHealth(){
        return health;
    }
    public int[] getPosition(){
        return position;
    }

    public void move(int[] move){
        this.position[0] += move[0];
        this.position[1] += move[1];
    }
}
