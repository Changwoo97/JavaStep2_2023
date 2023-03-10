package chapter21.reader;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("reader.txt");
		
		for (int i; (i = fis.read()) != -1;) {
			System.out.println((char) i);
		}
		
		fis.close();
		System.out.println("end");
	}
}
