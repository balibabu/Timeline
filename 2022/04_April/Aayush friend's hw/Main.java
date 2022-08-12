import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Bug bug1=new Bug();
        Bug bug2=new Bug("purple","millipede");
        Bug arachnid1=new Arachnid();
        Bug arachnid2=new Arachnid("brown","tarantula");
        Bug insect1=new Insect();
        Bug insect2=new Insect("blue","beetle",false);
        Bug bee1=new Bee();
        Bug bee2=new Bee("yellow","hornet");
        Bug ant1=new Ant();
        Bug ant2=new Ant("black","leafcutter");


        ArrayList<Bug> list=new ArrayList<Bug>();
        list.add(bug1);
        list.add(bug2);
        list.add(arachnid1);
        list.add(arachnid2);
        list.add(insect1);
        list.add(insect2);
        list.add(bee1);
        list.add(bee2);
        list.add(ant1);
        list.add(ant2);

        int totalNoOfLegs=0;
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));

            if(list.get(i) instanceof Bee){
               Bee b=(Bee)list.get(i);
               b.harvestHoney();
               totalNoOfLegs+=b.numberOfLegs();
            }else if(list.get(i) instanceof Ant){
               Ant a=(Ant)list.get(i);
               a.buildAntHill();
               totalNoOfLegs+=a.numberOfLegs(1);
            }else if(list.get(i) instanceof Arachnid){
                Arachnid an=(Arachnid)list.get(i);
                totalNoOfLegs+=an.numberOfLegs();
            }else if(list.get(i) instanceof Insect){
                Insect ins=(Insect)list.get(i);
                totalNoOfLegs+=ins.numberOfLegs();
            }
        }
        System.out.println("Total number of legs: "+totalNoOfLegs);

    }
}
