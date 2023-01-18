package chapter12.mutiinterface;

public interface InterMenu1 {
	abstract String jajang();
	String jjambbong();
	
	default void show() {
		System.out.println("맛집~~");
	}
}
