
public class Car {
	private String Description;
	
	public Car (String Description) {
		this.Description = Description;
	}
	
	public void startEngine() {
		System.out.println("startEngine");
	}
	
	public void drive() {
		System.out.println("drive, type is : " + getClass().getSimpleName());
		runEngine();
	}
	
	protected void runEngine() {
		System.out.println("runEngine");
	}
}

class GasPoweredCar extends Car {
	
	private double AvgKmPerLitre;
	private int Cylinders = 4;
	
	public GasPoweredCar(String Description) {
		super(Description);
	}
	
	public GasPoweredCar(String Description, double AvgKmPerLitre, int Cylinders) {
		super(Description);
		this.AvgKmPerLitre = AvgKmPerLitre;
		this.Cylinders = Cylinders;
	}
	
	@Override
	public void startEngine() {
		System.out.printf("all %d cylinders fired up %n", Cylinders);
	}
	
	@Override
	protected void runEngine() {
		System.out.printf("gas usage in 100km is %.1fL %n", AvgKmPerLitre);
	}
	
}

class ElectricCar extends Car {
	
	private double AvgKmPerCharge;
	private int BatterySize;
	
	public ElectricCar(String Description) {
		super(Description);
	}
	
	public ElectricCar(String Description, double AvgKmPerCharge, int BatterySize) {
		super(Description);
		this.AvgKmPerCharge = AvgKmPerCharge;
		this.BatterySize = BatterySize;
	}
	
	@Override
	public void startEngine() {
		System.out.printf("%d kWh battery is ready to use%n", BatterySize);
	}
	
	@Override
	protected void runEngine() {
		System.out.printf("Avarage range is %.1fKm%n", AvgKmPerCharge);
	}
}

class HybritCar extends Car {
	
	private double AvgKmPerLitre;
	private int Cylinders;
	private int BatterySize;
	
	public HybritCar(String Description) {
		super(Description);
	}
	
	public HybritCar(String Description, double AvgKmPerLitre, int Cylinders, int BatterySize) {
		super(Description);
		this.AvgKmPerLitre = AvgKmPerLitre;
		this.Cylinders = Cylinders;
		this.BatterySize = BatterySize;
	}
	
	@Override
	public void startEngine() {
		System.out.printf("%d kWh battery is ready to use%n", BatterySize);
		System.out.printf("all %d cylinders fired up %n", Cylinders);
	}
	
	@Override
	protected void runEngine() {
		System.out.printf("gas usage in 100km is %.1fL %n", AvgKmPerLitre);
	}
}