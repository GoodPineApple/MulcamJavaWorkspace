package test02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		BufferedInputStream in = null; // �뷮�� ū ���������� ��� Buffered �� �̿��Ͽ� �����̷� ����, �ӵ��� ����
		BufferedOutputStream out = null;

		try {
			in = new BufferedInputStream(new FileInputStream("Koala.jpg"));
			out = new BufferedOutputStream(new FileOutputStream("copy.jpg"));

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("����Ϸ�");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
