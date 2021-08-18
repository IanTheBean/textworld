package textworld;

public class Location {
    private Resource[] contents;
    private int[] amounts;
    private String biome;

    public Location(String biome, Resource[] resources){
        this.contents = resources;
        this.biome = biome;
    }

    public Resource[] getContents(){
        return this.contents;
    }

    public boolean hasResource(String name){
        for(Resource resource : this.contents){
            if(resource.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void removeResource(String name){
        for(int k = 0; k < this.contents.length;k++){
            Resource resource = this.contents[k];
            int amount = amounts[k];
            if(resource.getName().equals(name)){
                if(amount == 1){
                    Resource[] contentsCopy = new Resource[this.contents.length - 1];
                    int[] amountsCopy = new int[this.amounts.length];
                    for (int i = 0, j = 0; i < this.contents.length; i++) {
                        if (i != k) {
                            contentsCopy[j++] = this.contents[i];
                            amountsCopy[j++] = this.amounts[i];
                        }
                    }
                    this.contents = contentsCopy;
                    this.amounts = amountsCopy;
                }else{
                    amounts[k]--;
                }
            }
        }
    }
    public String render(){
        return "";
    }
}
