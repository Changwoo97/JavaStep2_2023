package chapter13;

public class AnonyInner {
	public void test() {
		new TestInner() {
			@Override
			public void printData() {
				System.out.println("파이팅!!");
			}
		}.printData();
	}
	
	public static void main(String[] args) {
		AnonyInner in = new AnonyInner();
		in.test();
	}
}
