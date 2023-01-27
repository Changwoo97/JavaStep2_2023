package chapter22;

public class Runners implements Runnable {

	@Override
	public void run() {
		String[] runners = { "1", "2", "3", "4", "5" };
		
		int max = 0;
		
		while (true) {
			int count = 0;
			
			for (int i = 0; i < runners.length; i++) {
				int dist = (int) (Math.random() * 5) + 1;
				
				for (int j = 0; j < dist; j++) {
					runners[i] =  " " + runners[i];
				}
				
				if (runners[i].length() > max) {
					max = runners[i].length();
				}
				
				if (runners[i].length() > 40) {
					count++;
				}
			}
			
			for (int i = 0; i < runners.length; i++) {
				System.out.println(runners[i]);
			}
			
			printLine(max);
			
			if (count >= runners.length) {
				break;
			}
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}

		for (String runner : runners) {
			System.out.print(runner);
			
			if (runner.length() >= max) {
				System.out.print(" WINNER");
			}
			
			System.out.println();
		}
		
		printLine(max);
	}
	
	private void printLine(int count) {
		for (int i = 0; i < count; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
}
