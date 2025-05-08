public class SmartKitchen {
	
	private CoffeeMaker brewMaster;
	private Refrigerator iceBox;
	private DishWasher dishWasher;
	
	public SmartKitchen() {
		brewMaster = new CoffeeMaker();
		iceBox = new Refrigerator();
		dishWasher = new DishWasher();
	}
	
	public CoffeeMaker getBrewMaster() {
		return brewMaster;
	}
	public Refrigerator getIceBox() {
		return iceBox;
	}
	public DishWasher getDishWasher() {
		return dishWasher;
	}
	
	public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
		brewMaster.setHasWorkToDo(coffeeFlag);
		iceBox.setHasWorkToDo(fridgeFlag);
		dishWasher.setHasWorkToDo(dishWasherFlag);
	}
	
	public void doKitchenWork() {
		brewMaster.brewCoffe();
		iceBox.orderFood();
		dishWasher.doDishes();
	}

	public void addWater() {
		
	}
	
	public void pourMilk() {
		
	}
	
	public void loadDishWasher() {
		
	}
}

class Refrigerator {
	
	private boolean hasWorkToDO;

	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDO = hasWorkToDo;
	}
	
	public void orderFood() {
		if(hasWorkToDO) {
			System.out.println("Ordering Food");
			hasWorkToDO = false;
		}
	}
}

class DishWasher {

	private boolean hasWorkToDO;
	
	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDO = hasWorkToDo;
	}
	
	public void doDishes() {
		if(hasWorkToDO) {
			System.out.println("Washing Dishes");
			hasWorkToDO = false;
		}
	}
}

class CoffeeMaker {

	private boolean hasWorkToDO;
	
	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDO = hasWorkToDo;
	}
	
	public void brewCoffe(){
		if(hasWorkToDO) {
			System.out.println("Brewing Coffee");
			hasWorkToDO = false;
		}
	}
}

