package test11;

import test12.Speedtoofast;
import test12.speedtoosmall;

public class Car {
	private int speed;
	private String color;
	private String model;

	public Car() {
	}

	public Car(int s, String c, String m) {
		speed = s;
		color = c;
		model = m;
	}

	public void speedup() throws Exception { //Throw
		speed += 10;
		if (speed > 300) {
		throw new Speedtoofast();
		}
	}

	public void speeddown() throws Exception {
		speed -= 10;

		if (speed < 0) {
			throw new speedtoosmall();
		}
	}
}
