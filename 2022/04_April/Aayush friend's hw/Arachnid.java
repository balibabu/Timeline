public class Arachnid extends Bug {
    Arachnid(){
        this("brown","Arachnid");
    }
    Arachnid(String color, String species){
        super(color,species);
    }
    public String toString(){
        return "Arachnid is " + super.toString();
    }
    public String noise(){
        return "scuttle";
    }
    public int numberOfLegs(){
        return 8;
    }
}