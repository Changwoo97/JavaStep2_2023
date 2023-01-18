package chapter14.Wrapper;

public class BoxingUnboxingExample {
	public static void main(String[] args) {
		// Autoboxing (Integer)
		Integer obj1 = 100;
		Integer obj2 = 200;
		Integer obj3 = Integer.valueOf(300);
		
		Integer total1 = obj1 + obj2;
		Integer total2 = obj2 + obj3;
		
		System.out.println("Integer total : " + total1);
		System.out.println("Integer total : " + total2);
		System.out.println();
		
		// Unboxing (int)
		int value1 = obj1.intValue();
		int value2 = obj2;
		int value3 = obj3;
		
		Integer total3 = value1 + value2;
		Integer total4 = value2 + value3;
		
		System.out.println("Integer total : " + total3);
		System.out.println("Integer total : " + total4);
		
	}
}
