package test04;

public class Test2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable2("A"));
		Thread t2 = new Thread(new MyRunnable2("B"));
		t1.start();
		t2.start();
	}

}
