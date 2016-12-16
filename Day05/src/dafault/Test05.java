package dafault;


public class Test05 {
	public static void main(String[] args) {
		System.out.println("--프로그램이 시작됩니다.--");
		
		for(int i = 1; i <=5; i++) {
			System.out.println("i:"+i);
			for(int j=1; j<=10; j++){
				System.out.print(j+"  ");
			}
			System.out.println("end i:" + i);
		}
		
		System.out.println("--프로그램이 종료됩니다.--");
	}

}
