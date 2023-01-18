package example;

import java.util.Scanner;

public class Actor {
	public static void main(String[] args) {
		var actor = new String[][] { 
				{ "[송강호]", "박쥐", "괴물", "관상" }, 
				{ "[김수현]", "도둑들", "수상한 그녀", "은밀하게 위대하게" },
				{ "[이병헌]", "지아이조", "레드", "광해" } 
				};
		int cnt = -1;

		try (var scan = new Scanner(System.in)) {
			System.out.print("검색할 배우 : ");
			var actName = scan.next();
			
			for (int i = 0; i < actor.length; i++) {
				if (("[" + actName + "]").equals(actor[i][0])) {
					cnt = i;
					break;
				}
			}

			if (cnt < 0) {
				System.out.println("해당 배우가 존재하지 않습니다.");
				return;
			}

			for (int i = 0; i < actor[cnt].length; i++) {
				System.out.println(actor[cnt][i]);
			}
		}
	}
}
