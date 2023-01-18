package chapter16.generic2;

public class GenericPrinterMain {
	public static void main(String[] args) {
		var printerPowder = new GenericPrinter<Powder>();
		printerPowder.setMaterial(new Powder());
		var powder = printerPowder.getMaterial();
		System.out.println(powder);
		powder.doPrinting();
		System.out.println();
		
		var printerPlastic = new GenericPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic());
		var plastic = printerPlastic.getMaterial();
		System.out.println(plastic);
		plastic.doPrinting();
		System.out.println();
		
//		var printerWater = new GenericPrinter<Water>();
//		printerWater.setMaterial(new Water());
//		var water = printerWater.getMaterial();
//		System.out.println(water);
//		water.doPrinting();
		
		var water = new Water();
		water.doPrinting();
	}
}
