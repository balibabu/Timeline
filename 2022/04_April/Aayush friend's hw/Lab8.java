import java.util.ArrayList;
public class Lab8 {
    public static void main(String[] args) {
        ArrayList<Bug>bugs=new ArrayList<>();

        bugs.add(new Bug());
        bugs.add(new Bug("purple","millipede"));
        bugs.add(new Arachnid());
        bugs.add(new Arachnid("brown","tarantula"));
        bugs.add(new Insect());
        bugs.add(new Insect("blue","beetle",false));
        bugs.add(new Bee());
        bugs.add(new Bee("yellow","hornet"));
        bugs.add(new Ant());
        bugs.add(new Ant("black","leafcutter"));
        int totalLegs=0;
        for(int i=0;i<bugs.size();i++)
        {
            System.out.println(bugs.get(i));
            if(bugs.get(i) instanceof Bee)
            {
                Bee temp=(Bee)bugs.get(i);
                temp.harvestHoney();
            }
            if(bugs.get(i) instanceof Ant)
            {
                Ant temp=(Ant)bugs.get(i);
                temp.buildAntHill();
                totalLegs+=temp.numberOfLegs(1);
            }
            if(bugs.get(i) instanceof Arachnid)
            {
                Arachnid temp=(Arachnid)bugs.get(i);
                totalLegs+=temp.numberOfLegs();
            }
            if(bugs.get(i) instanceof Insect && !(bugs.get(i) instanceof Bee))
            {
                Insect temp=(Insect)bugs.get(i);
                totalLegs+=temp.numberOfLegs();
            }
        }
        System.out.println("Total number of legs "+totalLegs);
    }
}