import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Trapezoid t1=new Trapezoid(1,2,3);
        Trapezoid t2=new Trapezoid();
        t2.setBreadth1(3);
        t2.setBreadth2(8);
        t2.setHeight(23);
        Trapezoid t3=new Trapezoid(2,12,13);
        Trapezoid t4=new Trapezoid(11,19,16);
        Trapezoid t5=new Trapezoid(10,12,15);

        ArrayList<Trapezoid> list=new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}