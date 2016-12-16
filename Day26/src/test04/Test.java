package test04;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		File dir = new File("c:/ktm");
		
		System.out.println(dir.isDirectory());
		
		for(File f : dir.listFiles()) {
			System.out.println(f.getAbsolutePath());
		}
	}

}
