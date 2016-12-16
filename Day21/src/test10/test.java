package test10;

public class test {
	public static void main(String[] args) {

		try{
			countDown();
		} 
		
		catch(InterruptedException ex){
			System.out.println("예외처리를 countDown이 위임");
			ex.printStackTrace();
		}
		
		
	}

	public static void countDown() throws InterruptedException {//thread에서 throw로 위임
		for (int i = 0; i > 0; i--) {
			System.out.println("카운트:" + i);
		Thread.sleep(1000);//thread 오류 수정을 위한 경우들이 있음 
		}

		System.out.println("발사!");
	}
}
