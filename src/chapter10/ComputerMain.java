package chapter10;

public class ComputerMain {
	public static void main(String[] args) {
		int r = 10;
		
		var cal = new Calculator();
		System.out.println(cal.areaCircle(r));
		System.out.println();
		
		var com = new Computer();
		System.out.println(com.areaCircle(r));
	}
}
