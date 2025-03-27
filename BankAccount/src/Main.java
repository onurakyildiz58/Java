
public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setAccountNumber("1");
		bank.setAccountBalance(100);
		bank.setUserName("onur");
		bank.setUserMail("onur@gmail.com");
		bank.setUserPhoneNumber(123);
		
		bank.withdrawMoney(500);
		
		bank.getAccount();
	}
}
