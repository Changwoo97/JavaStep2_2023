package chapter09;

public class CustomerMain {
	public static void main(String[] args) {
		// VIP고객
		System.out.println("---- VIP고객 ----");
		int price = 10000;
		var vipCs = new VIPCustomer(1004, "홍길동", 900);
		
		int vipPrice = vipCs.calcPrice(price);
		System.out.println(vipCs.getCustomerName() + "님이 " + vipPrice + "원을 지불 완료하였습니다.");
		System.out.println(vipCs.showCustomer());
		
		System.out.println("---- 일반고객 ----");
		// price = 10000;
		
		var cs = new Customer(1001, "홍길순");
		System.out.println(cs.getCustomerName() + "님이 " + cs.calcPrice(price) + "원을 지불 완료하였습니다.");
		System.out.println(cs.showCustomer());
	}
}
