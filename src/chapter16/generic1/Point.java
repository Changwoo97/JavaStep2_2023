package chapter16.generic1;

public class Point<T extends Number, V extends Number> {
	// 멤버변수
	private T x;
	private V y;
	
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
}
