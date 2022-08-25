package chapter_1;

public class dynamic_array {

	public static void main(String[] args) {
		Dynamic_array arr=new Dynamic_array();
		arr.add(5);
		arr.add(3);
		arr.add(9);
		arr.add(10);
		arr.remove(1);
		arr.add(1);
		arr.set(1, 3);
		arr.set(0, 25);
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
	}

}
	
class Dynamic_array{
	int size_max=1;
	int[] array=new int[size_max];
	int c=0;
	
	public void add(int num) {
		if(c<size_max) {
			array[c]=num;
			c++;
		}else {
			array=increase(array);
			add(num);
		}
		
	}
	public int get(int index) {
		return array[index];
	}
	public int size() {
		return c;
	}
	public void remove(int index) {
		for(int i=index;i<c;i++) {
			try {
				array[i]=array[i+1];
			} catch (Exception e) {
				array[c-1]=0;
			}
		}
		c--;
	}
	public void set(int index,int value) {
		int temp=array[index];
		array[index]=value;
		for(int i=index;i<c-1;i++) {
			int t=array[i+1];
			array[i+1]=temp;
			temp=t;	
		}
		add(temp);
	}
	
	int[] increase(int[] arr) {
		size_max*=2;
		int[] new_arr=new int[size_max];
		for(int i=0;i<arr.length;i++) {
			new_arr[i]=arr[i];
		}
		return new_arr;
	}
}
