package chapter12.Interface;

public class SmartTelevisionMain {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolume(10);
		System.out.println("-----------------");
		
		tv.turnOff();
		tv.search("www.naver.com");
		System.out.println("-----------------");
		
		// Remote 클래스에 정의되어 있는 메소드만 오버라이딩이 인식되어
		Remote rc = tv;
		rc.turnOn();
		rc.setVolume(-7);
		rc.turnOff();
		
		Searchable s = tv;
		s.search("www.google.com");
	}
}
