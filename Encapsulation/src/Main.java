public class Main {
	public static void main(String[] args) {
		Player p1 = new Player();
		p1.name = "onur";
		p1.health = 100;
		p1.weapon = "baseball bat";
		
		p1.loseHealth(20);
		System.out.println(p1.healthRemaining());
		
		p1.loseHealth(80);
		System.out.println(p1.healthRemaining());
		
		p1.restoreHealth(100);
		System.out.println(p1.healthRemaining());
		
		SecurePlayer p2 = new SecurePlayer("onur", 222, "sword");
		System.out.println(p2.healthRemaining());
		
	}
}
