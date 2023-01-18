package chapter13;

import java.util.Scanner;

public class EnumMain {
	public enum Item {
		START, PAUSE, EXIT
	}

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			while (true) {
				System.out.print("숫자를 입력하세요[0:게임시작, 1:일시정지, 2:게임종료] : ");
				int num = scan.nextInt();
				
				Item start = Item.START; 
				Item pause = Item.PAUSE;
				Item exit = Item.EXIT;
				
				if (num == start.ordinal()) {
					System.out.println("게임이 시작함");
				} else if (num == pause.ordinal()) {
					System.out.println("게임이 일시정지됨");
				} else {
					System.out.println("게임종료");
					return;
				}
			}
		}
	}
}
