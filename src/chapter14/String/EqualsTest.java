package chapter14.String;

public class EqualsTest {
	public static void main(String[] args) {
		// String 클래스는 이미 toString으로 재정의 되어있음
		String str1 = new String("test");
		String str2 = new String("test");
		
		Student studentLee = new Student(100, "이상우");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상우");
		
		System.out.println("---- 동일한 주소의 두 인스턴스 비교 ----");
		if (studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		}
		
		System.out.println("---- 동일한 주소의 두 인스턴스 비교 ----");
		if (studentLee == studentSang) {
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		}
		
		if (studentLee.equals(studentSang)) {
			System.out.println("studentLee와 studentSang의 같습니다.");
		} else {
			System.out.println("studentLee와 studentSang의 다릅니다.");
		}

		System.out.println("------------- 데이터 값은 같으나 hash값이 다르므로 재정의가 필요 ---------------");
		System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값 : " + System.identityHashCode(studentSang));
		
		// HashCode가 재정의 되어 있음
		System.out.println("------ String 클래스의 실제값 출력 ------");
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());
	}
}
