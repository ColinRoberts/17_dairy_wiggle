// @BC: This superclass and its subclasses are simple, clean, effective. Nicely done!
public abstract class Employee {
	private double effectivenessMultiplyer;
	private int baseWeeklySalary;
	private int totalPaymentToDate;
	private int bonus;
	public Employee(int salary, int b) {
		totalPaymentToDate = 0;
		effectivenessMultiplyer = 1.0;
		baseWeeklySalary = salary;
		bonus = b;
	}
	public abstract void work();
	public void earnPaycheck() {
		totalPaymentToDate += baseWeeklySalary * effectivenessMultiplyer;
	}
	// @BC: In the instructions it specifies that earnBonus should take a parameter --
	//	this way each time an employee earns a bonus it can be for a new, random amount
	//	(rather than making the bonus potentially constant for each employee)
	public void earnBonus() {
		totalPaymentToDate += bonus;
	}
	public void setEM(double num) {
		effectivenessMultiplyer = num;
	}
	public double getEM() {
		return effectivenessMultiplyer;
	}
	public String toString() {
		// @BC: The string is missing a space at the end, 
		return "I am an employee with an effectiveness multiplyer of "+effectivenessMultiplyer+", a weekly salary of "+baseWeeklySalary+", and a total payment of"+totalPaymentToDate;
	}
}
