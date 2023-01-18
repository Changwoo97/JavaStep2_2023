package chapter12.mutiinterface;

public class InterMenuMain implements InterMenu3 {
	public static void main(String[] args) {
		InterMenuMain im = new InterMenuMain();
		InterMenu1 im1 = im; // 업캐스팅
		InterMenu2 im2 = im; // 업캐스팅
		InterMenu3 im3 = im; // 업캐스팅
		
		System.out.println("------- InterMenu1 --------");
		System.out.println(im1.jajang());
		System.out.println(im1.jjambbong());
		im1.show();
		
		System.out.println("------- InterMenu2 --------");
		System.out.println(im2.tangsuyuck());
	}
	
	@Override
	public String jajang() {
		return "하나 죽으면 아는 짜장면";
	}

	@Override
	public String jjambbong() {
		return "찹살탕수육";
	}

	@Override
	public String boggembab() {
		return "해물볶음밥이 짱!!";
	}

	@Override
	public String tangsuyuck() {
		return null;
	}
	
}
