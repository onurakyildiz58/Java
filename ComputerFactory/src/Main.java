public class Main {
	public static void main(String[] args) {

		//inheritance is a way of reuse functionality and attributes.
		//composition is a way to make combination of classes act like a single coherent object
		
		ComputerCase theCase = new ComputerCase("2022", "Dell", "240");
		Monitor theMonitor = new Monitor("VG249QL3A", "Asus", 24, "1920 x 1080");
		MotherBoard theMotherBoard = new MotherBoard("PRIME B650M-R", "Asus", 2, 2, "v3.2.2");
		
		PersonalComputer thePC = new PersonalComputer("2022", "Dell", theMonitor, theMotherBoard, theCase);
		
		thePC.powerUp();
	}
}
