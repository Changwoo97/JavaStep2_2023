package chapter15;

public class StringTest1 {
	public static void main(String[] args) {
		String javaStr = new String("java "); // heap
		String androidStr = new String(" android");
		System.out.println(javaStr);
		System.out.println(javaStr.hashCode());
		System.out.println(System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr);
		System.out.println();
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr));
	}
}
