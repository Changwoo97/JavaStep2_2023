package chapter21.inputstream;

import java.io.IOException;

public class SystemTest1 {
	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요.");
		try {
			for (int i; (i = System.in.read()) != '\n';) {
				System.out.println((char) i + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
