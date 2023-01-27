package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamTest05 {
	public static void main(String[] args) {
		String path = "resource.txt";
		
		try (var fos = new FileOutputStream(path, true);
				var fis = new FileInputStream(path)) {
			fos.write('A');
			fos.write('B');
			fos.write('C');
			
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
		} catch (Exception e) {
			
		}
	}
}
