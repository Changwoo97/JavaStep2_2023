package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		var scan = new Scanner(System.in);
		var arr = new ArrayList<UserInfo>();

		WHILE: while (true) {
			System.out.print("ID > ");
			var id = scan.next();

			// 아이디 중복 체크
			for (var userInfo : arr) {
				if (userInfo.getId().equals(id)) {
					System.out.println("중복된 아이디입니다.");
					continue WHILE;
				}
			}

			// 중복된 아이디가 아니라면 pw입력
			System.out.print("PW > ");
			int pw = scan.nextInt();
			arr.add(new UserInfo(id, pw));

			System.out.println();
		}
	}
}
