public class Trapezoid{
    private double height;
    private double breadth1;
    private double breadth2;
    Trapezoid(){
        this(0,0,0);
    }
    Trapezoid(double height,double breadth1,double breadth2){
        this.height=height;
        this.breadth1=breadth1;
        this.breadth2=breadth2;
    }
    public void setHeight(double h){
        height=h;
    }
    public void setBreadth1(double b1){
        breadth1=b1;
    }
    public void setBreadth2(double b2){
        breadth2=b2;
    }
    public double getHeight(){
        return height;
    }
    public double getBreadth1(){
        return breadth1;
    }
    public double getBreadth2(){
        return breadth2;
    }
    public double getArea(){
        double area=5*height*(breadth1+breadth2);
        return area;
    }
    public String toString(){
        return "\nTrapezoid\nHeight: "+height+"\nBreadth_1: "+breadth1+"\nBreadth_2: "+breadth2+"\nArea: "+getArea();
    }
}
