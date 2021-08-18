package textworld;
import java.util.Arrays;
import java.util.Scanner;

public class Renderer {
    private Scanner scanner;

    public Renderer(){
        scanner = new Scanner(System.in);
    }
    public void start(){
        int[] playerPosition = Main.player.getPosition();
        Biome location = Main.world[playerPosition[0]][playerPosition[1]];
    }
    public void error(){
        this.render("Hmm... I didn't get that one.\nTry 'help' for a list of commands");
    }

    public void inventory(){
        this.render(Main.player.getInventory().render());
    }

    public void next(){
        this.render("What would you like to do now?");
    }

    public void quit(){
        System.out.println("Thank you for playing!");
    }

    public void harvest(String tool, Resource resource, int amount){
        this.render("You see some " + resource.getName() + "s. You proceed to whack them with your " + tool + " until they give you a " + resource.getLoot());
    }

    public void cantHarvest(Resource resource){
        this.render("No many what you try, you cannot seem to break the " + resource.getName() + "s");
    }

    public void harvestError(String resourceName){
        this.render("You turn in a circle. You cannot seem to find any " + resourceName + "s anywhere you look");
    }

    public void craft(String recipe){
        this.render("You craft a " + recipe);
    }

    public void cantCraft(String recipe, String requirements){
        this.render("You try to make a " + recipe + " but you don't seem to have everything required to make it. in order to make it you need:\n" + requirements);
    }

    public void craftError(String recipe){
        this.render("You search your memory, but you don't seem to know what a " + recipe + " is nevertheless how to make it.");
    }

    public void move(int[] move){
        int[] playerPosition = Main.player.getPosition();
        Biome location = Main.world[playerPosition[0]][playerPosition[1]];

        String direction = "";
        if(move[0] == 1){
            direction = "east";
        } else if(move[0] == -1){
            direction = "west";
        } else if(move[1] == 1){
            direction = "north";
        } else if(move[1] == -1){
            direction = "south";
        }

    }

    public void render(String text){
        if(text.length() != 0) {
            System.out.println(text);
        }
        System.out.print(">> ");
        String response = scanner.nextLine();
        String[] command = response.split(" ", 2);
        if(command.length == 1) {
            Main.processor.run(command[0], "");
        }else{
            Main.processor.run(command[0], command[1]);
        }
    }
}
