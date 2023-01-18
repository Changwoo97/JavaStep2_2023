package chapter11;

public class CarMain {
	public static void main(String[] args) {
//		method(new ManualCar());
//		method(new AICar());
//		
		Car myCar = new AICar();
		myCar.run();
		myCar = new ManualCar();
		myCar.run();
	}
	
	public static void method(Car car) {
		car.drive();
		car.stop();
	}
}
