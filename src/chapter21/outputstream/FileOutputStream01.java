package chapter21.outputstream;

import java.io.FileOutputStream;

public class FileOutputStream01 {
	public static void main(String[] args) {
		String path = "output1.txt";
		
		try (var fos = new FileOutputStream(path)) {
			byte[] bs = new byte[26];
			byte data = 'A';
			
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data++;
			}
			
			fos.write(bs);
			fos.write('\n');
			fos.write(bs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("저장이 완료 되었습니다.");
	}
}
