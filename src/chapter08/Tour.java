package chapter08;

import java.util.Scanner;

public class Tour {
	public static void main(String[] args) {
		try (var scan = new Scanner(System.in)) {
			System.out.print("관광객 수: ");
			int numOfTourist = scan.nextInt();
			scan.nextLine();
			
			var guide = new Guide(numOfTourist);
			guide.inputGuests(scan);
			
			WHILE: while (true) {
				System.out.println("=======================");
				System.out.println("1. 관광객 정보");
				System.out.println("2. 목적지 변경");
				System.out.println("3. 종료");
				System.out.println();
				
				System.out.print("선택>> ");
				int select = scan.nextInt();
				scan.nextLine();
				
				switch (select) {
				case 1:
					guide.showGuestsInfo();
					break;
				case 2:
					guide.changePoint(scan);
					break;
				default:
					break WHILE;
				}
			}
			System.out.println("종료");
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}
