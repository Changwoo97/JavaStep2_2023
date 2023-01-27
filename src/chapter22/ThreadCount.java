package chapter22;

import java.util.Scanner;

public class ThreadCount implements Runnable {
	
	private int n;
	
	public ThreadCount(int n) {
		this.n = n;
	}
	
	public static void main(String[] args) {
		// 스캐너를 이용하여 키보드에서 숫자를 입력받고
		// 입력 받은 숫자가 1씩 감소하다가 0이 되었을 때
		// "종료"라는 메세지와 함께 스레드를 빠져나오도록 구현하시오.
		
		try (var scan = new Scanner(System.in)) {
			System.out.print("값을 입력하세요 : ");
			int num = scan.nextInt();
			
			var  tc = new ThreadCount(num);
			// 스레드 객체 및 실행
			var t = new Thread(tc);
			t.start();
			t.join();
			System.out.println("끝");
		} catch (InterruptedException e) {

		} 
		
	}

	@Override
	public void run() {
		n++;
		while (--n > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			
			System.out.println(n);
		}
	}
	
}
