package assignment7;

public class testing {

	public static void main(String[] args) {
		MyCircularLinkedList<String> ob=new MyCircularLinkedList<>();
		ob.add("bali");
		ob.add("babu");
		ob.add("chauhan");
		ob.add("name");
		ob.add(0,"hello");
		ob.add(2,"bye");
		ob.add("babu");
		ob.showAll();
//		System.out.println(ob.contains("hello"));
		System.out.println(ob.indexOf("babu"));
		System.out.println(ob.lastIndexOf("babu"));
		ob.removeFirst();
		System.out.println(ob.get(0));
		System.out.println(ob.size());
	}

}
