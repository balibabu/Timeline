public class Bee extends Insect {
    Bee(){
        this("yellow","Bee");
    }
    Bee(String color,String species){
        super(color,species,true);
    }
    public String toString(){
        String s="Bee is a "+super.getColor()+" "+super.getSpecies() +" that goes "+super.noise("whizz")+ " and it can fly";
        return s;
    }
    public void harvestHoney(){
        System.out.println("Harvesting honey!");
    }
}