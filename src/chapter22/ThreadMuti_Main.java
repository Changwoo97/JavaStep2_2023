package chapter22;

public class ThreadMuti_Main {

	public static void main(String[] args) {
		var t1 = new ThreadEx03();
		var t2 = new ThreadEx03_2();
		
		t1.start();
		t2.start();
		// 번갈아가면서 실행됨
	}
	
}
