package textworld;

import java.util.Random;

public class Biome {
    private String name;
    private Random random;
    //TODO enemies
    //TODO animals
    private Resource[] resources;

    public Biome(String name, Resource[] resources) {
        this.resources = resources;
        this.name = name;
        this.random = new Random();
    }
    public Location createLocation(){
        float population = Math.round(this.random.nextFloat() * 4 + 4);
        int resourceAmountToSpawn = Math.round(population / 2);
        int entityAmountToSpawn = Math.round(population / 4);
        Resource[] resourcesToSpawn = new Resource[resourceAmountToSpawn];
        for(int i = 0; i<resourceAmountToSpawn;i++){
            resourcesToSpawn[i] = resources[random.nextInt(resources.length)];
        }

        return new Location(this.name, resourcesToSpawn);
    }
}
