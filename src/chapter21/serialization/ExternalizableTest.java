package chapter21.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable {
	
	String name;
	
	public Dog() {
		
	}

	@Override
	public void writeExternal(ObjectOutput out) 
			throws IOException {
		out.writeUTF(name);
	}

	@Override
	public void readExternal(ObjectInput in) 
			throws IOException, ClassNotFoundException {
		name = in.readUTF();
	}

	@Override
	public String toString() {
		return name;
	}
	
}

public class ExternalizableTest {
	
	public static void main(String[] args) 
			throws IOException, ClassNotFoundException {
		// Externalizable : 
		// 인터페이스 Externalizable을 사용하여 내부의 내용을 쉽게 조작함
		// writeExternal() / readExternal()
		
		var myDog = new Dog();
		myDog.name = "백설";

		// 직렬화
		try (var fos = new FileOutputStream("external.out");
				var oos = new ObjectOutputStream(fos)) {
			oos.writeObject(myDog);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// 역직렬화
		try (var fis = new FileInputStream("external.out");
				var ois = new ObjectInputStream(fis)) {
			System.out.println(ois.readObject());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
