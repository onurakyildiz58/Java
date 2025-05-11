public class Main {
	public static void main(String[] args) {
		
	/*
		Item coke = new Item("drink", "coke", 1.2);
		coke.printItem();
		coke.setSize("LARGE");
		coke.printItem();
		
		System.out.println("-".repeat(40));
		Item avocado = new Item("side", "avocado", 1.5);
		avocado.printItem();
		avocado.setSize("SMALL");
		avocado.printItem();
		
		System.out.println("-".repeat(40));
		Burger burger = new Burger("regular", 4.0);
		burger.addTopping("BACON", "CHEESE", "MAYO");
		burger.printItem();
		
	*/
		MealOrder order = new MealOrder();
		order.addBurgerToppings("HAM", "MAYO", "CHEESE");
		order.setDrinkSize("LARGE");
		order.printItemizedList();
		
		MealOrder deluxe = new MealOrder("deluxe", "pepsi", "fries");
		deluxe.addBurgerToppings("HAM", "BACON", "CHEESE", "LETTUCE", "MAYO");
		deluxe.setDrinkSize("LARGE");
		deluxe.printItemizedList();
	}
}
