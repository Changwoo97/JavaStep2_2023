package chapter16.generic2;

public class ThreeDPrinterMain {
	public static void main(String[] args) {
		var printerPowder = new ThreeDPrinter();
		var p1 = new Powder();
		printerPowder.setMaterial(p1);
		System.out.println(p1);
		
		var p2 = (Powder) printerPowder.getMaterial();
		System.out.println(p2);
		
		var printerPlastic = new ThreeDPrinter();
		var p3 = new Plastic();
		printerPlastic.setMaterial(p3);
		System.out.println(p3);
	}
}
