package chapter09;

public class SuperMain {
	public static void main(String[] args) {
		Paprika obj = new Paprika();
		
		obj.set1("피망류", "여름", "노랑파프리카");
		obj.set2("빨강", 7000, "빨강파프리카");
		
		obj.disp1();
		obj.disp2();
	}
}
