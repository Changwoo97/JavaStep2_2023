package chapter21.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {
	public static void main(String[] args) {
		long time = 0;
		
		try (var fis = new FileInputStream("a.zip");
				var fos = new FileOutputStream("copy.zip")) {
			time = System.currentTimeMillis();
			
			for (int i; (i = fis.read()) != -1;) {
				fos.write(i);
			}
			
			time = System.currentTimeMillis() - time;
			
			
		} catch (Exception e) {
			
		}
		
		System.out.println("파일 복사 하는데 " + time + "msec 소요되었습니다.");
	}
}
