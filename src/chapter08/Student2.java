package chapter08;

public class Student2 {
	public static int serialNum = 10000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		studentID = ++serialNum;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
}
