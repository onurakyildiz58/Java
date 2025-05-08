public class SecurePlayer {
	
	private String fullName;
	private int health;
	private String weapon; 
	
	public SecurePlayer(String name) {
		this(name, 100, "none");
	}
	public SecurePlayer(String fullName, int health, String weapon) {
		this.fullName = fullName;
		this.weapon = weapon;
		if(health <= 0) {
			this.health = 1;
		}else if(health > 100) {
			this.health = 100;
		}else {
			this.health = health;
		}
	}
	
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
