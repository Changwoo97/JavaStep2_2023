package chapter16.generic1;

class MyArrayG<T> {
	private Object[] array = new Object[10];
	private int i;

	public void add(T obj) {
		array[i++] = obj;
	}

	public T get(int index) {
		return (T) array[index];
	}
}

public class MyArrayTest2 {
	public static void main(String[] args) {
		MyArrayG<String> myArray1 = new MyArrayG<>();
		myArray1.add(new String("test"));
		String str = myArray1.get(0);
		System.out.println(str);

		MyArrayG<Integer> myArray2 = new MyArrayG<>();
		myArray2.add(10);
		Integer num = myArray2.get(0);
		System.out.println(num);
	}
}
