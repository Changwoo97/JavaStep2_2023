package chapter12.mutiinterface;

public class Customer implements Buy, Sell {
	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	// 같은 메서드명이 존재하면 오버라이딩 필수
//	@Override
//	public void order() {
//		System.out.println("고객판매주문");
//	}
}
