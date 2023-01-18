package chapter09;

public class ParentMain {
	public static void main(String[] args) {
		var c1 = new ChildExam();
		
		System.out.println(c1.getCar());
		System.out.println(c1.getMoney()); // 상속받은 재산
		
		// ----------------------------------
		if (c1 instanceof ParentExam) {
			System.out.println("c1은 parentExam의 자식 클래스 입니다.");
		}
		
		// =================================
		// 형변환
		var ch = new ChildExam();
		var p1 = new ParentExam();
		System.out.println("-------------------");
		// 부모 = 자식
		p1 = ch; // 자동 형변환
		
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		System.out.println("-------------------");
		
		if (p1 instanceof ChildExam) {
			ch = (ChildExam)p1;
		}
	}
}
