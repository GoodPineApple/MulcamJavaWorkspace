package test04;

public class MyRunnable2 extends Thread {
	String myName;
	public MyRunnable2(String name) {
		myName = name;
	}
	public void run() {
		for(int i = 10; i >= 0; i--) {
			System.out.print(myName + i + " ");
		}
	}
}
