package chapter19.lambda;

@FunctionalInterface
interface PrintString {
	void showString(String str);
}

public class TestLambda {
	
	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);
		showMyString(lambdaStr);
		
		PrintString reStr = returnString(); // returnString() 메소드 안에 있는 람다식 구현부 호출
		reStr.showString("hello");
		showMyString(reStr);
		showMyString(str -> System.out.println(str));
	}
	
	public static void showMyString(PrintString p) { // 매개변수 구현 => p가 body
		p.showString("hello lambda");
	}
	
	public static PrintString returnString() { // 반환값으로 body구현
		return s -> System.out.println(s + " World");
	}
	
}
