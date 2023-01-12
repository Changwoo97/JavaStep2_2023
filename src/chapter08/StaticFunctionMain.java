package chapter08;

public class StaticFunctionMain {
	public static void main(String[] args) {
		var obj = new StaticFunction();
		System.out.println(obj.getStatic());
		
		System.out.println(StaticFunction.getStatic());
	}
}
