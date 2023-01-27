package chapter21.inputstream;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest02 {
	public static void main(String[] args) {
		String path = "./src/chapter21/inputstream/Input.txt";
		// 한글 깨짐
		// FileInputStream fis = null;
		
		try (FileReader fis = new FileReader(path);) {
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println();
		System.out.println("end");
	
	}
}
