package chapter08;

public class Bank {
	private String point;
	private String tel;
	static float interest;
	
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
	}
	
	public void getBank() {
		System.out.println("지점 : " + point);
		System.out.println("전화번호 : " + tel);
		System.out.println("은행이자 : " + interest);
	}
}
