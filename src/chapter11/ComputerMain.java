package chapter11;

public class ComputerMain {
	public static void main(String[] args) {
		// 추상 클래스는 객체를 만들 수 없다.
//		Computer c1 = new Computer();
//		Computer c3 = new Notebook();
		
		Computer c2 = new Desktop();
		Computer c4 = new MyNotebook();
		c2.typing();
		c2.display();
		c4.typing();
		c4.display();
	}
}
