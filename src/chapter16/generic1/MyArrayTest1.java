package chapter16.generic1;

class MyArray {
	private Object[] array = new Object[10];
	private int i;

	public void add(Object obj) {
		array[i++] = obj;
	}

	public Object get(int index) {
		return array[index];
	}
}

public class MyArrayTest1 {
	public static void main(String[] args) {
		MyArray myArray1 = new MyArray();
		myArray1.add(new String("test"));
		String str = (String) myArray1.get(0);
		System.out.println(str);
		
		MyArray myArray2 = new MyArray();
		myArray2.add(10);
		str = myArray2.get(0).toString();
		System.out.println(str);
	}
}
