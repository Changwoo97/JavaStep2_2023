package chapter20;

public class AutoCloseTest1 {
	public static void main(String[] args) {
		try (AutoCloseObj obj1 = new AutoCloseObj()) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 부분 입니다.");
		}
	}
}
