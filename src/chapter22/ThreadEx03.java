package chapter22;

public class ThreadEx03 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			
			System.out.println(1);
		}
	}
	
}
