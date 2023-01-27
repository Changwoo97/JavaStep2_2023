package chapter19.lambda;

public class TestStringConcat {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";

		// 인스턴스 방식
		System.out.println("---- 인스턴스 방식 ----");
		StringConcatImple f1 = new StringConcatImple();
		f1.makeString(s1, s2);

		// 익명의 내부 클래스 방식
		System.out.println("---- 익명의 내부 클래스 방식 ----");
		StringConcat f2 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		f2.makeString(s1, s2);
		
		// 람다식 방식
		System.out.println("---- 람다식 방식 ----");
		StringConcat f3 = (str1, str2) -> System.out.println(str1 + ", " + str2);
		f3.makeString(s1, s2);
	}
}
