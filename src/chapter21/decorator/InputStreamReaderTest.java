package chapter21.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		// FileInputStream : 파일로 저장되어 있는 것만 읽음
		
		try (var isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			for (int i; (i = isr.read()) != -1;) {
				System.out.println((char) i);
			}
		} catch (Exception e) {
			
		}
		
//		var socket = new Socket();
//		
//		try {
//			var ir = new InputStreamReader(socket.getInputStream());
//			var br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			br.readLine();
//		} catch (Exception e) {
//			
//		}
	}
}
