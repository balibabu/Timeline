package aayush;

public class Tree {
	int numBranches;
	String name;
	double height;
	boolean isEvergreen;
	public static int numInForest=0;
	Tree(){
		numBranches=0;
		name="";
		height=0;
		isEvergreen=true;
		numInForest++;
	}
	Tree(int nB,String n,double h,boolean e){
		numBranches=nB;
		name=n;
		height=h;
		isEvergreen=e;
		numInForest++;
	}
	
	public void calculateHeight(double myHeight,double myShadowLength,double treeShadowLength ) {
		height= (myHeight * treeShadowLength) / myShadowLength;
	}
	public String toString() {
		return "\nName of tree: "+name+"\nHeight of tree: "+Math.round(height)+"\nis the tree Evergreen: "+isEvergreen;
	}
	
	public static void main(String[] args) {
		Tree t1=new Tree(5,"Mango",0,true);
		t1.calculateHeight(1.5, 3, 5.2);
		Tree t2=new Tree(3,"Guava",0,true);
		t2.calculateHeight(1.3, 2.4, 6.4);
		Tree t3=new Tree(7,"Teak",0,false);
		t3.calculateHeight(1.7, 4.2, 10.3);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		System.out.println("\nTotal no. of trees recorded: "+numInForest);
		
	}

}
