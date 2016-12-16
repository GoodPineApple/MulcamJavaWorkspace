package programming02;

public class PlaneTest {

	public static void main(String[] args) {
		Plane Aplane = new Plane("chinapower", "TR-878");
		Aplane.setMaxPsaaenger(300);
		System.out.println(Aplane.printPlane());
		
		Plane Bplane = new Plane();
		System.out.println(Bplane);
		System.out.println(Bplane.printPlane());
		
		Plane Cplane = new Plane(2000);
		Cplane.setModel("MyPet");
		Cplane.setMade("TM-3000");
		System.out.println(Cplane.printPlane());
		
		System.out.println("비행기 개수: " + (Aplane.getPlanes() + Bplane.getPlanes() + Cplane.getPlanes()));
	}
	
}