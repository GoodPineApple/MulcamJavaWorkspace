package test01;

public class Test01 {

	public static void main(String[] args) {
		int[] a = {45, 21, 79, 57, 54, 65, 98, 12, 13, 10, 79, 54, 666, 702541};
		
		
		
		System.out.println(countEven(a));
		System.out.println(a[5]);
	}
	

	public static int countEven(int[] list) {
		list[5] = 99;
		int count = 0;
		for(int n : list ) {
			if(n%2 == 0) {
				count++ ;
			}
		}
		return  count ;
	}
}
