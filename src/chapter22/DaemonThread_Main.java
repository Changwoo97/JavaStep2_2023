package chapter22;

public class DaemonThread_Main implements Runnable {

	static boolean autoSave = false; // 자동저장기능 잠김
	
	public static void main(String[] args) {
		// Runnable의 run()은 Thread의 객체로 반드시 변환하여 사용해야
		// 스레드로 활용 가능하다.
		
		var dm = new DaemonThread_Main();
		var t = new Thread(dm); // 스레드 객체로 변환
		// 데몬스레드로 설정 : 메인이 종료되면 함께 종료됨
		t.setDaemon(true);
		t.start();
		
		for (int i = 1; i <= 15; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			
			if (i == 3) {
				autoSave = true;
			}
		}
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if (autoSave) {
				System.out.println("자동저장 됩니다.");
			}
		}
	}
	
}
