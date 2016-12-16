
public class Test02 {

	public static void main(String[] args) {
		
		String s = new String("Hello, everyone~");
		
		String r1 = s.substring(3);
		String r2 = s.substring(0, 5);
		String r3 = s.toUpperCase();
		String r4 = s.toLowerCase();
		String r5 = s.replace('H', 'A');
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
	}

}
