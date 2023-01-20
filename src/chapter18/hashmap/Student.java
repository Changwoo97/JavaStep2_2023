package chapter18.hashmap;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			var student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		}
		
		return false;
	}

	@Override
	public String toString() {
		return String.format("학번 : %d번, 이름 : %s님의 점수", sno, name);
	}	
}
