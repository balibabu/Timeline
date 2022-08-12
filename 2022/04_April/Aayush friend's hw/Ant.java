public class Ant extends Insect {
    Ant(){
        this("red","Ant");
    }
    Ant(String color, String species){
        super(color,species,false);
    }
    public String toString(){
        String s="Ant is a "+getColor()+" ant that goes "+noise("dink")+" and it cannot fly";
        return s;
    }
    public void buildAntHill(){
        System.out.println("Building ant hill!");
    }
    public int numberOfLegs(int injured){
        return super.numberOfLegs()-injured;
    }
}