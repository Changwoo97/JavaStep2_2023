package chapter17.arraylist;

import java.util.ArrayList;

class Shape {
	void draw() {
		System.out.println("draw shape");
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("draw circle");
	}

	void circle() {
		System.out.println("원 모양 입니다.");
	}
}

class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("draw rectangle");
	}

	void rectangle() {
		System.out.println("사각형 모양 입니다.");
	}
}

class Triangle extends Shape {
	@Override
	void draw() {
		System.out.println("draw triangle");
	}

	void triangle() {
		System.out.println("삼각형 모양 입니다.");
	}
}

public class ShapeTest {
	ArrayList<Shape> sList = new ArrayList<Shape>();

	public static void main(String[] args) {
		ShapeTest sTest = new ShapeTest();
		System.out.println("---- 업캐스팅 ----");
		sTest.addShape();
		System.out.println("---- 다운캐스팅 ----");
		sTest.testCasting();

	}

	public void addShape() {
		sList.add(new Circle());
		sList.add(new Rectangle());
		sList.add(new Triangle());

		for (var shape : sList) {
			shape.draw();
		}
	}

	public void testCasting() {
		for (var iter = sList.iterator(); iter.hasNext();) {
			var shape = iter.next();

			if (shape instanceof Circle) {
				((Circle) shape).circle();
			} else if (shape instanceof Rectangle) {
				((Rectangle) shape).rectangle();
			} else if (shape instanceof Triangle) {
				((Triangle) shape).triangle();
			} else {
				System.out.println("지원되지 않는 타입입니다.");
			}
		}
	}
}
