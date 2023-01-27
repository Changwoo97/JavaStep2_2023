package chapter22;

public class AccountThread implements Runnable {

	Account account;
	
	public AccountThread(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		while (true) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			
			// 출금액을 100 ~ 300원 사이의 난수로 지정
			int money = (int) (Math.random() * 200.0) + 100;
			account.withdraw(money);
			System.out.println("잔액 : " + account.balance);
		}
	}

}
