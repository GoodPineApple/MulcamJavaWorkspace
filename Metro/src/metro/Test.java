package metro;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		MetroDao metroDao = new MetroDao();
		
		metroDao.createConnection();
	
	
		
		String b = metroDao.selectInfo(101).getStn();
		
		System.out.println(b);
		
		
		
		
	}

}
