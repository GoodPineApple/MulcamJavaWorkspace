package programming02;

public class Plane {
	private String made;
	private String model;
	private int maxPassenger;
	private int planes;
	
	public Plane(String made, String model) {
		this.made = made;
		this.model = model;
		planes++;
	}
	public Plane() {
		this("asiana", "TX-505");
	}
	public Plane(int maxPassenger) {
		this.maxPassenger = maxPassenger;
		planes++;
	}
	
	public int getPlanes() {
		return planes; 
	}
	
	public void setMade(String made) {
		this.made = made;
	}
	public String getMade() {
		return made;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	
	public void setMaxPsaaenger(int maxPassenger) {
		this.maxPassenger = maxPassenger;
	}
	public int getMaxpassenger() {
		return maxPassenger;
	}
	public String printPlane() {
		return "Á¦Á¶»ç:" + made + " ¸ðµ¨:" + model + " ÃÖ´ë½Â°´:" + maxPassenger;
	}
}
