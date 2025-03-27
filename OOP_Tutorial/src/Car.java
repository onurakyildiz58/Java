
public class Car {

	private String make;
	private String model;
	private String colour;
	private int door;
	private boolean convertible;

	public void carFeatures() {
		System.out.println(
				door + "-Doors " + colour + " " + model + " " + make + " " + (convertible ? "convertible" : " "));
	}

	public void setMake(String make) {
		if(make == null) make = "unknown";
		this.make = make;
	}

	public void setModel(String model) {
		if(model == null) model = "unknown";
		this.model = model;
	}

	public void setColour(String colour) {
		if(colour == null) colour = "unknown";
		this.colour = colour;
	}

	public void setDoor(int door) {
		this.door = door; 	
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}
}
