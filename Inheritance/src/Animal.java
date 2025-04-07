public class Animal {
	
	protected String type;
	private String size;
	private double weight;
	
	public Animal() {
		
	}
	
	public Animal(String type, String size, Double weight) {
		this.type = type;
		this.size = size;
		this.weight = weight;
	}

	public void move(String speed) {
		System.out.println(type + " moves " + speed);
	}
	
	public void makeNoise() {
		System.out.println(type + " makes some kinda noise.");
	}
	
	@Override
	public String toString() {
		return "Animal {\n" + 
				" type = '" + type + "',\n" +
				" size = '" + size + "',\n" +
				" weight = '" + weight + "',\n}\n";
	}
}
