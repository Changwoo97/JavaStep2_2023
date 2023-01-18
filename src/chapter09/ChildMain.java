package chapter09;

public class ChildMain {
	public static void main(String[] args) {
		Child child = new Child();
		
		child.method1();
		child.method2();
		child.method3();
		System.out.println();
		
		Parent parent = new Parent();
		parent.method1();
		parent.method2();
		System.out.println();
		
		Parent parent2 = child;
		parent2.method1();
		parent2.method2();
	}
}
