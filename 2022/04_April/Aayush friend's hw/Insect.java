public class Insect extends Bug {
    private boolean canFly;
    Insect(){
        this("red","Insect",false);
    }
    Insect(String color,String species,boolean canFly){
        super(color,species);
        this.canFly=canFly;
    }
    public String toString(){
        if (canFly)
            return "Insect is "+super.toString()+" it can fly";
        return "Insect is "+super.toString()+" it cannot fly";
    }
    public String noise(String additionalNoise){
        return noise()+additionalNoise;
    }
    public String noise(){
        return "buzz";
    }
    public int numberOfLegs(){
        return 6;
    }
}