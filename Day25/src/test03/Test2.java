package test03;

public class Test2 {
	public static void main(String[] args) {
		Thread t = new Thread(new MyThread());
		t.start();
		
	}

}
