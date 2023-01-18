package chapter14.clone;

public class ObjectCloneMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		Circle circleCopy = circle.clone();
		
		System.out.println(circle);
		System.out.println(circleCopy);
		
		System.out.println(System.identityHashCode(circleCopy));
		System.out.println(System.identityHashCode(circle));
		
	}
}
