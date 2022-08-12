package aayush;

import java.util.ArrayList;

public class QuizAnswerKey {

	public static void main(String[] args) {
		AdditionProblem ap1=new AdditionProblem(2, 4);
		AdditionProblem ap2=new AdditionProblem(6,6);
		AdditionProblem ap3=new AdditionProblem(4,9);
		AdditionProblem ap4=new AdditionProblem(7,9);
		AdditionProblem ap5=new AdditionProblem(8,6);
		AdditionProblem ap6=new AdditionProblem(9,4);
		AdditionProblem ap7=new AdditionProblem(5,5);
		
		AdditionProblem cap1=new ComplexAdditionProblem(2,1,3);
		AdditionProblem cap2=new ComplexAdditionProblem(2,5,1);
		AdditionProblem cap3=new ComplexAdditionProblem(0,1,4);
		
		ArrayList<AdditionProblem> object=new ArrayList<AdditionProblem>();
		object.add(ap1);
		object.add(ap2);
		object.add(ap3);
		object.add(ap4);
		object.add(ap5);
		object.add(ap6);
		object.add(ap7);
		
		object.add(cap1);
		object.add(cap2);
		object.add(cap3);
		
		for(int i=0;i<object.size();i++) {
			System.out.println(object.get(i)+"="+object.get(i).answer());
			if( object.get(i) instanceof ComplexAdditionProblem) {
				ComplexAdditionProblem temp=(ComplexAdditionProblem)object.get(i);
				System.out.println(temp.showIntermediateStep());
			}
		}
		
	}

}

/*
2 + 4 = 6
6 + 6 = 12
4 + 9 = 13
7 + 9 = 16
8 + 6 = 14
9 + 4 = 13
5 + 5 = 10

2 + 1 + 3 = 6
==> 2 + 4 = 6
2 + 5 + 1 = 8
==> 2 + 6 = 8
0 + 1 + 4 = 5
==> 0 + 5 = 5
*/