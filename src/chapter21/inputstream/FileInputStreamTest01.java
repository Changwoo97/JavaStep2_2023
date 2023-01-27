package chapter21.inputstream;

import java.io.FileInputStream;

public class FileInputStreamTest01 {
	public static void main(String[] args) {
		String path = "./src/chapter21/inputstream/Input.txt";
		try (var fis = new FileInputStream(path)) {
			System.out.println(fis.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
