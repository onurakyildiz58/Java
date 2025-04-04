public class Bank {
	private String accountNumber;
	private double accountBalance;
	private String userName;
	private String userMail;
	private String userPhoneNumber;

	public Bank() {
		System.out.println("empty constructor called");
	}
	
	public Bank(String accountNumber, double accountBalance, String userName, String userMail, String userPhoneNumber) {
		System.out.println("accoutn constructor called with data");
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.userName = userName;
		this.userMail = userMail;
		this.userPhoneNumber = userPhoneNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void setUserName(String userName) {	
		this.userName = userName;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public void getAccount() {
		System.out.println(accountNumber + " : hesap numarası ");
		System.out.println(accountBalance + "$ para");
		System.out.println(userName + " : kullanıcı adı ");
		System.out.println(userMail + " : kullanıcı maili ");
		System.out.println(userPhoneNumber + " : telefon numarası");
	}

	public void withdrawMoney(double amount) {
		if (this.accountBalance - amount <= 0) {
			System.out.println("paran yok aga");
		} else {
			this.accountBalance = (double) this.accountBalance - amount;
			System.out.println("yeni bakiye : " + this.accountBalance);
		}
	}

	public void depositMoney(double amount) {
		this.accountBalance = (double) this.accountBalance + amount;
		System.out.println("yeni bakiye : " + this.accountBalance);
	}

}
