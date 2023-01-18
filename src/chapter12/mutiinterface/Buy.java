package chapter12.mutiinterface;

public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("구매주문");
	}
}
