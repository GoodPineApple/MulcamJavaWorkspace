package test01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		FileInputStream in = null; // 1byte씩 전송.
		FileOutputStream out = null; // InputStream과 OutputStream은 like 빨대. 
		
		try {
			in = new FileInputStream("text.txt");
			out = new FileOutputStream("test.txt");
			
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("복사완료");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(in!=null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(out!=null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
