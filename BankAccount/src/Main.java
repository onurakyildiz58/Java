
public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank("12345", 0, "onur", "onur@gmail.com", "+90 500 500 5050");
		
		bank.depositMoney(600);
		bank.withdrawMoney(111.11);
		bank.depositMoney(20.45);
		
		bank.getAccount();
	}
}
