package test03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {  //�ٽɱ���� FileInputStream
			br = new BufferedReader(new InputStreamReader(new FileInputStream("text.txt")));
			String arg = br.readLine();
			
			System.out.println("���ϳ���:" + arg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
