public class Bank {
	private String accountNumber;
	private int accountBalance;
	private String userName;
	private String userMail;
	private int userPhoneNumber;

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

	public void setUserPhoneNumber(int userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public void getAccount() {
		System.out.println(accountNumber + " : hesap numarası ");
		System.out.println(accountBalance + "$ para");
		System.out.println(userName + " : kullanıcı adı ");
		System.out.println(userMail + " : kullanıcı maili ");
		System.out.println(userPhoneNumber + " : telefon numarası");
	}

	public void withdrawMoney(int amount) {
		if (this.accountBalance - amount <= 0) {
			System.out.println("paran yok aga");
		} else {
			this.accountBalance = this.accountBalance - amount;
			System.out.println("yeni bakiye : " + this.accountBalance);
		}
	}

	public void depositMoney(int amount) {
		this.accountBalance = this.accountBalance + amount;
		System.out.println("yeni bakiye : " + this.accountBalance);
	}

}
