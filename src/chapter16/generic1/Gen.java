package chapter16.generic1;

public class Gen {
	public <T> void printArray(T[] arr) {
		for (var element : arr) {
			System.out.print(" " + element);
		}
		System.out.println();
	}
}
