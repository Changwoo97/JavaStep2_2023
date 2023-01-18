package chapter10;

import java.util.Scanner;

public class CalculatorExamMain {
	public static void main(String[] args) {
		var scan = new Scanner(System.in);
		
		System.out.print("n1 > ");
		int n1 = scan.nextInt();
		System.out.print("n2 > ");
		int n2 = scan.nextInt();
		scan.close();
		
//		System.out.println("CalPlus : " + (new CalPlus()).getResult(n1, n2));
//		System.out.println("CalMunus : " + (new CalMinus()).getResult(n1, n2));
		
		var p = new CalPlus();
		System.out.println(name(p) + " : " + calc(p, n1, n2));
		var m = new CalMinus();
		System.out.println(name(m) + " : " + calc(m, n1, n2));
	}
	
	public static int calc(CalculatorExam c1, int a, int b) {
		return c1.getResult(a, b);
	}
	
	public static String name(CalculatorExam c) {
		return c.getClass().getSimpleName();
	}
}
