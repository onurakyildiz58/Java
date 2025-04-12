
public class SalariedEmployee extends Employee {
	private double annualSalary;
	private boolean isRetired;
	
	public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary, boolean isRetired) {
		super(name, birthDate, hireDate);
		this.annualSalary = annualSalary;
		this.isRetired = isRetired;
	}
	
	@Override
	public double collectPay() {
		double payCheck = annualSalary / 26;
		double retriedPayCheck = (isRetired) ? 0.9 * payCheck : payCheck;
		return (double) retriedPayCheck;
	}
	
	public void retire() {
		this.isRetired = true;
	}
}
