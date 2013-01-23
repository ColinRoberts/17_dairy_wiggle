class Shaker extends Employee {
	public Shaker() {
		super(150, 100);
	}
	public void shake() {
		setEM(getEM() + 0.02);
	}
	public void work() {
		shake();
	}
}