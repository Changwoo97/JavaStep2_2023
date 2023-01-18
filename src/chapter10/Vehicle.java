package chapter10;

public class Vehicle {
	private static final int PRICE = 1000;
	
	public int vehiclePrice() {
		return PRICE;
	}
	
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}
