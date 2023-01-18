package chapter16.generic1;

public class GenericMain {
	public static <T extends Number, V extends Number> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double h1 = ((Number) p1.getX()).doubleValue();
		double v1 = ((Number) p1.getY()).doubleValue();

		double h2 = ((Number) p2.getX()).doubleValue();
		double v2 = ((Number) p2.getY()).doubleValue();

		double width = Math.abs(h2 - h1);
		double height = Math.abs(v2 - v1);

		return width * height;
	}

	public static void main(String[] args) {
		var p1 = new Point<Integer, Double>(0, 0.0);
		var p2 = new Point<Integer, Double>(10, 10.0);

		double rect = GenericMain.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 point로 만들어진 사각형의 넓이 : " + rect + "입니다.");
	}
}
