
public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal("dog", "normal", 40.0);
		doAnimalStuff(animal, "fast");
		
		Dog dog = new Dog();
		doAnimalStuff(dog, "fast");
		
		Dog yorkie = new Dog("yorkie", 15.0);
		doAnimalStuff(yorkie, "fast");
		
		Dog retriver = new Dog("retriver", 75.0, "floppy", "swimmer");
		doAnimalStuff(retriver, "slow");
		
		Dog wolf = new Dog("wolf", 100.0, "cupped", "black-tipped");
		doAnimalStuff(wolf, "fast");
		
		Fish goldie = new Fish("golie", 1.4, 2, 3);
		doAnimalStuff(goldie, "fast ");
	}
	
	public static void doAnimalStuff(Animal animal, String speed) {
		animal.move(speed);
		animal.makeNoise();
		System.out.println(animal);
		System.out.println("- - - - - - - - - - - - - - - -");
	}
}
