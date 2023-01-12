package chapter08;

public class Company {
	// 객체를 단 하나만 생성하는 클래스
	private static Company instance = new Company();
	
	// 일반적인 객체 생성
	public Company() { }
	
	// Singleton 객체 생성 메소드
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}
