import java.util.ArrayList;

class Fruit{
    public void taste(){
        System.out.println("sweet");
    }
}
class Mango extends Fruit{
    public void seed(){
        System.out.println("single seed");
    }
}
class Papaya extends Fruit{
    public void Veg(){
        System.out.println("also vegetable");
    }
}

public class testing {
    public static void main(String[] args){
        Mango obj1=new Mango();
        Papaya obj2=new Papaya();

        ArrayList<Fruit> ls=new ArrayList<>();
        ls.add(obj1);
        ls.add(obj2);

        System.out.println(ls.get(0) instanceof Mango);
        Mango m=(Mango)ls.get(0);
        m.seed();
        m.taste();


        // obj1.taste();
        // obj2.taste();



        System.out.println("done");
    }
}