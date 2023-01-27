package chapter22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountMain {
	
	public static void main(String[] args) {
		var acc = new Account();
		var accountThread = new AccountThread(acc);
		var t = new Thread(accountThread);
		t.start();

		// 스레드와는 별개로 값을 받아 입금시키는 코드
		
		try (var scan = new Scanner(System.in)) {
			while (true) {
				try {
					System.out.println("입금할 돈을 입력하세요 : ");
					int n = scan.nextInt();
					acc.deposit(n);
				} catch (InputMismatchException e) {
					
				}
			}
		}
	}
	
}
