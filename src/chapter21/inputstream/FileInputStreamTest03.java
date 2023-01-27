package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest03 {
	public static void main(String[] args) {
		String path = "Input2.txt";

		try (var fis = new FileInputStream(path)) {
			byte[] bs = new byte[10];

			for (int i; (i = fis.read(bs)) != -1;) {
				for (int j = 0; j < i; j++) {
					char ch = (char) bs[j];
					System.out.print(ch);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		System.out.println();
		System.out.println("end");
	}
}
