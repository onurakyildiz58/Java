public class Main {
	public static void main(String[] args) {
		Car focus = new Car ("2018 Ford Focus RS");
		runRace(focus);
		
		Car kuga = new GasPoweredCar("2025 Ford Kuga", 9.5, 3);
		runRace(kuga);
		
		Car machE = new ElectricCar("2025 Ford Mustang Mach-e", 600, 358);
		runRace(machE);
		
		Car custom = new HybritCar("2025 Ford Custom", 5.5, 4, 11);
		runRace(custom);
	}
	
	public static void runRace (Car car) {
		car.startEngine();
		car.drive();
		System.out.println("-".repeat(20));
	}
}
