package chapter08;

import java.util.Scanner;

public class Guide {
	static String point = "발리";
	Guest[] guests;

	public Guide(int n) {
		try {
			guests = new Guest[n];
			for (int i = 0; i < guests.length; i++) {
				guests[i] = new Guest();
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	public void inputGuests(Scanner scan) {
		try {
			System.out.println("관광객 등록");

			for (int i = 0; i < guests.length; i++) {
				System.out.print((i + 1) + ". 이름: ");
				var name = scan.nextLine();

				System.out.print((i + 1) + ". 성별: ");
				var gender = scan.nextLine();

				guests[i].setName(name);
				guests[i].setGender(gender);

				if (i + 1 < guests.length) {
					System.out.println("-----------------------");
				}
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	public void showGuestsInfo() {
		try {
			for (int i = 0; i < guests.length; i++) {
				var guest = guests[i];
				System.out.println((i + 1) + ". 이름: " + guest.getName());
				System.out.println((i + 1) + ". 성별: " + guest.getGender());
				System.out.println((i + 1) + ". 목적지: " + guest.getPoint());

				if (i + 1 < guests.length) {
					System.out.println("------------------------------");
				}
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	public void changePoint(Scanner scan) {
		try {
			System.out.print("어디로 변경하시겠습니까: ");
			point = scan.nextLine();
			System.out.println(point + "로 목적지 변경");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

}
