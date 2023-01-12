package chapter08;

public class StudentMain2 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이재민");
		System.out.println("이름: " + studentLee.studentName);
		System.out.println("아이디: " + studentLee.getStudentID());
		
		System.out.println();
		
		Student1 studentKim = new Student1();
		studentKim.setStudentName("김창우");
		System.out.println("이름: " + studentKim.studentName);
		System.out.println("아이디: " + studentKim.getStudentID());
		
		System.out.println();
		
		Student1 studentPark = new Student1();
		studentPark.setStudentName("박창훈");
		System.out.println("이름: " + studentPark.studentName);
		System.out.println("아이디: " + studentPark.getStudentID());
	}
}
