import java.util.*;
public class polynomial {
	node poly;
	Scanner sc = new Scanner(System.in);
	public void fetch() {
		node expn = new node();
		System.out.println("enter cofficient");
		expn.coff = sc.nextInt();
		System.out.println("enter power of x");
		expn.pow = sc.nextInt();
		poly = expn;
		System.out.println("do you want to add more term y/n");
		char a = sc.next().charAt(0);
		while (a == 'y') {
			node term = new node();
			System.out.println("enter cofficient");
			term.coff = sc.nextInt();
			System.out.println("enter power of x");
			term.pow = sc.nextInt();
			expn.plus = term;
			expn = term;
			System.out.println("do you want to add more term y/n");
			a = sc.next().charAt(0);
		}
	}
	public void display() {
		int[] pw = {8304, 185, 178, 179, 8308, 8309, 8310, 8311, 8312, 8313};
		node temp = poly;
		do {
			if (temp.coff !=1) {
				if (temp.pow > 1) {
					System.out.print(temp.coff + "x" + (char)pw[temp.pow]);
				} else if (temp.pow == 1) {
					System.out.print(temp.coff + "x");
				} else {
					System.out.print(temp.coff);
				}
			} else {
				if (temp.pow > 1) {
					System.out.print("x" + (char)pw[temp.pow]);
				} else if (temp.pow == 1) {
					System.out.print("x");
				} else {
					System.out.print(temp.coff);
				}
			}
			temp = temp.plus;
			if (temp != null) {
				if (temp.coff > 0) {
					System.out.print("+");
				}
			}
		} while (temp != null);
		System.out.println();
	}

	public void sort() {
		node i = poly;
		do {
			node j = poly;
			do {
				if (i.pow > j.pow) {
					int pows = i.pow;
					int cof = i.coff;
					i.pow = j.pow;
					i.coff = j.coff;
					j.pow = pows;
					j.coff = cof;
				}
				j = j.plus;
			} while (j != null);
			i = i.plus;
		} while (i != null);
	}

	public void add(polynomial p1, polynomial p2) {
		node a = p1.poly;
		node b = p2.poly;
		poly = a;
		while (a.plus != null) {
			a = a.plus;
		}
		a.plus = b;
		sort();

		node temp = poly;
		node sum = new node();
		poly = sum;
		sum.coff = temp.coff;
		sum.pow = temp.pow;
		temp = temp.plus;
		do {

			if (sum.pow == temp.pow) {
				sum.coff += temp.coff;
			} else {
				node n = new node();
				n.coff = temp.coff;
				n.pow = temp.pow;
				sum.plus = n;
				sum = n;
			}
			temp = temp.plus;
		} while (temp != null);
	}
}