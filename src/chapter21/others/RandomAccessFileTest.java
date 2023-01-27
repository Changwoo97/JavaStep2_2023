package chapter21.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	// 입출력 클래스중 유알하게 입출력이 동시에 가능한 클래스
	// 포인터를 이용하여 동시에 입출력이 가능하다
	// 다양한 자료형 메소드 제공
	public static void main(String[] args) 
			throws IOException {
		var rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println("파일 포인터의 위치 : " + rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("파일 포인터의 위치 : " + rf.getFilePointer());
		rf.writeUTF("눈이 옵니다."); // 한글자당 3바이트 3 * 5 + 2(null) = 17
		System.out.println("파일 포인터의 위치 : " + rf.getFilePointer());
		rf.seek(0);
		System.out.println("파일 포인터의 위치 : " + rf.getFilePointer());
		
		int i = rf.readInt();
		
		Double d = rf.readDouble();
		String u = rf.readUTF();
		
		rf.close();
	}
	
}
