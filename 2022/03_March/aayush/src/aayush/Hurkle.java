package aayush;

import java.util.Random;
import java.util.Scanner;

public class Hurkle {
	static int[] hurkle= {0,0};
	static int[] player= {0,0};
	static int[] holes= {0,0,0,0};
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		plotHoles();
		plotHurkle();
		char[][] board=getBoard();
		int score=0;
		while(true) {
			displayBoard(board);
			System.out.print("enter your move: ");
			char d=sc.next().charAt(0);
			if(d=='q') {
				System.out.println("You Lose");
				break;
			}
			int s=sc.nextInt();
			move(d,s);
			if(isWin()) {
				System.out.println("your score is "+score);
				break;
			}
			score++;
		}
		
	}
	
	public static void plotHoles() {
		Random r=new Random();
		int pos=0;
		while(pos!=4) {
			int a=r.nextInt(1,100);
			if(!isPresent(holes, a))
				holes[pos++]=a;
		}
	}
	public static void plotHurkle() {
		Random r=new Random();
		int h=r.nextInt(1,100);
		while(isPresent(holes, h)) {
//			display(holes);
			h=r.nextInt(1,100);
//			System.out.println(h);
		}
		hurkle[0]=h/10;
		hurkle[1]=h%10;
	}
	
	public static char[][] getBoard(){
		char[][] board=new char[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				board[i][j]='.';
			}
		}
		return board;
	}	
	
	public static boolean isPresent(int[] arr,int x) {
		for(int i:arr) {
			if(i==x)
				return true;
		}
		return false;
	}
	
	public static void displayBoard(char[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j< board[0].length;j++) {
				int temp=i*10+j;
				if(temp==holes[0]||temp==holes[1]||temp==holes[2]||temp==holes[3])
					System.out.print("0 ");
				else if(i==player[0] && j==player[1])
					System.out.print("@ ");
//				else if(i==hurkle[0] && j==hurkle[1])
//					System.out.print("H ");
				else
					System.out.print(". ");
			}
			System.out.println();
		}
	}
	public static void move(char direction,int step) {
		direction=Character.toLowerCase(direction);
		if(direction=='n') 
			player[0]-=step;
		else if(direction=='e') 
			player[1]+=step;
		else if(direction=='w') 
			player[1]-=step;
		else if(direction=='s') 
			player[0]+=step;
		else
			System.out.println("Invalid direction");
		
		if(isPresent(holes, player[0]*10+player[1])) {
			System.out.println("You fell in the Hole");
			player[0]=0;
			player[1]=0;
		}
	}
	public static boolean isWin() {
		boolean win=false;
		if(hurkle[0]==player[0] && hurkle[1]==player[1]) {
			System.out.println("You Won");
			win=true;
		}else {
			showHint();
		}
		return win;
	}
	public static void showHint() {
		int r=hurkle[0]-player[0];
		int c=hurkle[1]-player[1];
		if(r<0 && c<0)
			System.out.println("The Hurkle is: NW");
		else if(r>0 && c>0)
			System.out.println("The Hurkle is: SE");
		else if(r<0 && c==0)
			System.out.println("The Hurkle is: N");
		else if(r>0 && c==0)
			System.out.println("The Hurkle is: S");
		else if(r<0 && c>0)
			System.out.println("The Hurkle is: NE");
		else if(r>0 && c<0)
			System.out.println("The Hurkle is: SW");
		else if(r==0 && c<0)
			System.out.println("The Hurkle is: W");
		else if(r==0 && c>0)
			System.out.println("The Hurkle is: E");
	}

}
