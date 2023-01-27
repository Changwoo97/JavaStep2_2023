package chapter21.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopyTest2 {
	public static void main(String[] args) {
		long time = 0;
		
		try (var fis = new FileInputStream("a.zip");
				var fos = new FileOutputStream("copy3.zip");
				var bis = new BufferedInputStream(fis);
				var bos = new BufferedOutputStream(fos);) {
			time = System.currentTimeMillis();
			
			for (int i; (i = bis.read()) != -1;) {
				fos.write(i);
			}
			
			time = System.currentTimeMillis() - time;
			
			
		} catch (Exception e) {
			
		}
		
		System.out.println("파일 복사 하는데 " + time + "msec 소요되었습니다.");
	}
}
