
public class Main {
	public static void main(String[] args) {
		
		Bank bank = new Bank("12345", 0, "onur", "onur@gmail.com", "+90 500 500 5050");
		
		bank.depositMoney(600);
		bank.withdrawMoney(111.11);
		bank.depositMoney(20.45);
		
		bank.getAccount();
		System.out.println("**********************************************");
		Customer customer1 = new Customer();
		Customer customer2 = new Customer("onur", 123.45, "onur@gamil.com");
		Customer customer3 = new Customer("jhon doe", "jhondoe@gmail.com");
		
		System.out.println("customer1 infos : ");
		System.out.println("Name : " + customer1.getName());
		System.out.println("Credit Limit : " + customer1.getCreditLimit());
		System.out.println("Email Address : " + customer1.getEmailAddress() + "\n");
		
		System.out.println("customer2 infos : ");
		System.out.println("Name : " + customer2.getName());
		System.out.println("Credit Limit : " + customer2.getCreditLimit());
		System.out.println("Email Address : " + customer2.getEmailAddress() + "\n");
		
		System.out.println("customer3 infos : ");
		System.out.println("Name : " + customer3.getName());
		System.out.println("Credit Limit : " + customer3.getCreditLimit());
		System.out.println("Email Address : " + customer3.getEmailAddress());
	}
}
