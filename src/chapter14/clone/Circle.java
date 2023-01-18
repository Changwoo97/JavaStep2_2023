package chapter14.clone;

public class Circle implements Cloneable {
	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public Circle(Point point, int radius) {
		this(point.getX(), point.getY(), radius);
	}
	
	// 클래스의 객체 복사
	@Override 
	public Circle clone() throws CloneNotSupportedException { 
		return new Circle(point, radius);
	}
	
	@Override 
	public String toString() {
		return "";
	}
}
