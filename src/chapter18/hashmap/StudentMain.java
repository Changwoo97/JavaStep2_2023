package chapter18.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		// 학생정보, 점수
		var map = new HashMap<Student, Integer>();
		
		// 중복 X
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(2, "홍길순"), 80);
		map.put(new Student(3, "서주희"), 90);
		map.put(new Student(4, "하동길"), 98);

		// 지정된 총 Entry수 출력
		System.out.println("총 Entry 수 : " + map.size());
		
		var keySet = map.keySet();
		for (var iter = keySet.iterator(); iter.hasNext();) {
			var key = iter.next();
			var value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		
		var scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("학생 번호를 입력하세요 : ");
			int sno = scan.nextInt();
			
			System.out.print("학생 이름을 입력하세요 : ");
			var name = scan.next();
			
			var key = new Student(sno, name);
			if (!map.containsKey(key)) {
				System.out.println("존재하지 않는 학생입니다.");
				continue;
			}
			
			var value = map.get(key);
			System.out.println(key.name + " 학생의 점수는 : " + value);
			break;
		}
	}
}
