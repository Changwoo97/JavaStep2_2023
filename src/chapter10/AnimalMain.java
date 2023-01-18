package chapter10;

public class AnimalMain {
	public static void main(String[] args) {
		System.out.println("------ 곰 ------");
		var bear = new Bear();
		System.out.println(bear.woong);
		System.out.println(bear.getEye());
		System.out.println(bear.getLeg());
		
		System.out.println("----- 사자 ------");
		var lion = new Lion();
		System.out.println(lion.galgi);
		System.out.println(lion.getEye());
		System.out.println(lion.getLeg());
		
		System.out.println("----- 거미 ------");
		var spider = new Spider();
		System.out.println(spider.web);
		System.out.println(spider.getEye());
		System.out.println(spider.getLeg());
	}
}
