package chapter11;

public class Desktop extends Computer {
	@Override
	public void display() {
		System.out.println("DeskTop Display()");
	}

	@Override
	public void typing() {
		System.out.println("Desktop Typing()");
	}
}
