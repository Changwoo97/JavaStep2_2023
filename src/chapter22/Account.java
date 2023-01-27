package chapter22;

public class Account {
	
	int balance = 1000; // 잔액
	
	// 출금 메서드
	public synchronized void withdraw(int money) {
		if (balance < money) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		
		balance -= money;
	}
	
	// 입금 메서드
	public synchronized void deposit(int money) {
		balance += money;
		notify();
	}

}
