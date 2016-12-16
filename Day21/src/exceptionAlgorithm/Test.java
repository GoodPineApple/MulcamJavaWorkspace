package exceptionAlgorithm;

import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		try{
			myMethod(-1);
			System.out.println("B"); //¾ÃÈû, myMethodº¸´Ù À§·Î ¿Ã¶ó°¡¸é Ãâ·ÂµÊ
		}catch(IOException ne){
			System.out.println("C");
		}finally {
			System.out.println("D");
		}
		System.out.println("E");
	}
	
	static void myMethod(int age) throws IOException {
		if(age < 0) {
			throw new IOException();
		}
		System.out.println("A");  // ¾ÃÈû, if¹® º¸´Ù À§·Î ¿Ã¶ó°¡¸é Ãâ·ÂµÊ
		
		
	}

}
