package chapter21.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamTest {
	public static void main(String[] args) {
		try (var fos = new FileOutputStream("data.txt");
				var dos = new DataOutputStream(fos);) {
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("IT's good");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (var fis = new FileInputStream("data.txt");
				var dis = new DataInputStream(fis);) {
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
