package chapter16.generic1;

public class GenMain {
	public static void main(String[] args) {
		Gen gen = new Gen();
		
		// 정수형
		Integer[] iArr = { 1, 2, 3, 4, 5 };
		// 실수형
		Double[] dArr = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		// 문자형
		Character[] cArr = { 'A', 'B', 'C', 'D', 'E' };
		
		gen.printArray(iArr);
		gen.printArray(dArr);
		gen.printArray(cArr);
	}
}
