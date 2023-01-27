package chapter21.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		try (var fw = new FileWriter("writer.txt")) {
			fw.write('A');
			fw.write(System.lineSeparator());
			fw.write(65);
			fw.write(System.lineSeparator());
			fw.write("65");
			fw.write(System.lineSeparator());
			char[] buf = { 'B', 'C', 'D', 'E', 'F', 'G' };
			fw.write(buf, 2, 2);
		} catch (IOException e) {
			
		}
		
		System.out.println("Done");
	}
}
