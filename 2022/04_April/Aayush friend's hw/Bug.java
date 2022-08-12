public class Bug {
    private String species;
    private String color;
    Bug(){
        this("tan","bug");
    }
    Bug(String color, String species){
        this.color=color;
        this.species=species;
    }
    public String noise(){
        return "blop";
    }
    public String toString(){
        return "a "+color+" "+species+" that goes "+noise();
    }
    public void setSpecies(String species){
        this.species=species;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getSpecies(){
        return species;
    }
    public String getColor(){
        return color;
    }

}
