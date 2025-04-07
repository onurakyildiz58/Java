public class Fish extends Animal {

	private int gills;
	private int fins;
	
	public Fish(String type, double weight, int gills, int fins) {
		super(
				type, 
				weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),  
				weight);
		this.fins = fins;
		this.gills = gills;
	}
	
	
	private void moveMuscles() {
		System.out.print("muscles moves ");
	}
	
	private void moveFins() {
		System.out.print("Fin moves ");
	}
	
	@Override
	public void move(String speed) {
		super.move(speed);
		moveMuscles();
		if(speed == "fast") {
			moveFins();
		}
		System.err.println("");
	}
	
	@Override
	public String toString() {
		return "Fish {\n" + 
				" Gills = '" + gills + "',\n" +
				" Fins = '" + fins + "',\n},\n" + super.toString();
	}
}
