package test04;

public class MyRunnable implements Runnable{
	String myName;
	public MyRunnable(String name) {
		myName = name;
	}
	@Override
	public void run() {
		for(int i = 10; i >= 0; i--) {
			System.out.print(myName + i + " ");
		}
	}
}
