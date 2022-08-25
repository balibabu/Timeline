package classwork;

import java.util.Scanner;

class node{
	int data;
	node left,right;
	node(int d){
		data=d;
		left=null;
		right=null;
	}
}
public class BinaryTree {
	node root;
	public static node create() {
		node root;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter data");
		int data=sc.nextInt();
		if(data==-1) return null;
		root=new node(data);
		System.out.println("enter node on left of "+data);
		root.left=create();
		System.out.println("enter node on right of "+data);
		root.right=create();
		return root;
	}
	public static void inOrder(node root) {
		if(root==null) return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	public static void main(String[] args) {
		node root=create();
		//inOrder(root);
	//	System.out.println(isheightBalanced(root));
	//	System.out.println(getDepth(root));
	//	System.out.println(pathsum(root, 0, 18));
	//	System.out.println("sum="+sum_root(root,0, 0));
		System.out.println(sum_of_binary(root, ""));
		
	}
	public static boolean isheightBalanced(node root) {
		int leftheight,rightheight;
		if(root==null) {
			return true;
		}
		leftheight=getDepth(root.left);
		rightheight=getDepth(root.right);
		
		if(Math.abs(leftheight-rightheight)<=1 && isheightBalanced(root.left) && isheightBalanced(root.right)) return true;
		return false;
	}
	public static int getDepth(node root) {
		if(root==null) return 0;
		return 1+Math.max(getDepth(root.left), getDepth(root.right));
	}
	public static boolean pathsum(node root,int sum,int target) {
		if(root==null) return false;
		sum+=root.data;
		if(root.left==null && root.right==null) {
			if(sum==target) return true;
			return false;
		}else {
			return pathsum(root.left, sum, target) || pathsum(root.right, sum, target);
		}
		
	}
	public static int sum_root(node root,int depth,int sum) {
		if(root==null) return 0;
		depth=depth*10+root.data;
		if(root.left==null && root.right==null) {
			return depth;
		}
		return sum_root(root.left, depth, sum)+sum_root(root.right, depth, sum);
		
	}
	public static String sum_of_binary(node root,String str) {
		if(root==null) {
			return "";
		}
		str+=root.data+"";
		if(root.left==null && root.right==null) {
			return str;
		}
		return sum(sum_of_binary(root.left, str), sum_of_binary(root.right, str));
	}
	public static String sum(String str1,String str2) {
		int n1=0,n2=0;
		if(!str1.equals("")) {
			n1=Integer.parseInt(str1, 2);
		}
		if(!str2.equals("")) {
			n2=Integer.parseInt(str2, 2);
		}
		return Integer.toBinaryString(n1+n2);
	}
}
