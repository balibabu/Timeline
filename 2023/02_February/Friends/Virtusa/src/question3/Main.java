package question3;

public class Main {
	public static void main(String[] args) {
		Thread evenThread=new Thread(new EvenThread());
		Thread oddThread=new Thread(new OddThread());
		evenThread.run();
		oddThread.run();
	}
}

class EvenThread implements Runnable{
	@Override
	public void run() {
		for(int i=2;i<=20;i+=2) {
			System.out.println("Thread even: "+i);
		}
	}
}

class OddThread implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=20;i+=2) {
			System.out.println("Thread Odd: "+i);
		}
	}
}