public class Main {
	public static void main(String[] args) {
		SalariedEmployee jhon = new SalariedEmployee("jhon", "21/02/2001", "01/01/2025", 86000.0, false);
		jhon.terminate("12/12/2025");
		System.out.println("age = " + jhon.getAge());
		System.out.println("pay = " + String.format("%.2f", jhon.collectPay()));
		jhon.retire();
		System.out.println("pay after retire = " + String.format("%.2f", jhon.collectPay()));
		System.out.println(jhon);
		
	}
}
