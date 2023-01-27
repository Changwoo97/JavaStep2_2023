package chapter21.reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("reader.txt");
		
		for (int i; (i = fis.read()) != -1;) {
			System.out.println((char) i);
		}
		
		fis.close();
		System.out.println("end");
		
		try (var fr = new FileReader("reader.txt")) {
			for (int i; (i = fr.read()) != -1;) {
				System.out.println((char) i);
			}
		} catch (IOException e) {
			
		}
	}
}
