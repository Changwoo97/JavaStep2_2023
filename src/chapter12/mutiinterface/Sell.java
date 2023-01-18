package chapter12.mutiinterface;

public interface Sell {
	void sell();
	
	// 같은 이름의 default 메소드는 존재할 수 없으므로 오버라이딩
	// 최종 오버라이딩 메소드가 출력됨
//	default void order() {
//		System.out.println("판매주문");
//	}
	
	default void sellOrder() {
		System.out.println("판매주문");
	}
}
