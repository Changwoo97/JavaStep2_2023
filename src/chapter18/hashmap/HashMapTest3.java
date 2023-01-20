package chapter18.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest3 {
	public static void main(String[] args) {
		var map = new HashMap<String, String>();

		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");

		var scan = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비밀번호를 입력하세요!");
			
			System.out.print("아이디 : ");
			var id = scan.next();

			if (!map.containsKey(id)) {
				System.out.println("존재하지 않는 아이디입니다.");
				continue;
			}

			System.out.print("비밀번호 : ");
			var pw = scan.next();
			
			if (!map.get(id).equals(pw)) {
				System.out.println("비밀번호가 일치하지 않습니다.");
				continue;
			}
			
			System.out.println("로그인 성공");
			break;
		}
	}
}
