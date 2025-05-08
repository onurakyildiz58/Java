public class Player {

	public String name;
	public int health;
	public String weapon; 
	
	public void loseHealth(int damage) {
		System.out.println("-" + damage + " is lost");
		health -= damage;
		if(health <= 0) {
			System.out.println("dead");
		}
	}
	
	public void restoreHealth(int extraHealth) {
		System.out.println("+" + extraHealth + " is gained");
		health += extraHealth;
		if(health > 100) {
			System.out.println("max health");
			health = 100;
		}
	}
	
	public int healthRemaining() {
		return health;
	}
}
