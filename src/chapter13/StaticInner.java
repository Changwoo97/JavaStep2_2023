package chapter13;

public class StaticInner {
	int a = 10;
	
	private int b = 100;
	static int c = 200;
	
	static class Inner {
		public void printData() {
			// a와 b는 static이 아니여서 데이터영역에서 사용할 수 없음
			// System.out.println("int a : " + a);
			// System.out.println("private int b : " + b);
			System.out.println("static c : " + c);
		}
	}
	
	public static void main(String[] args) {
//		MemberInner outer = new MemberInner();
//		MemberInner.Inner inner = outer.new Inner();
		Inner inner = new Inner();
		
		inner.printData();
	}
}
