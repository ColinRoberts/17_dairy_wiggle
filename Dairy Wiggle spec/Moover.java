import java.util.Random;
class Moover extends Employee {
	private int luck;
	private Random r;
	public Moover() {
		super(200, 150);
		r = new Random();
		
	}
	public void takeOrder() {
		luck = 1+r.nextInt(5);
		if (luck == 1) {
			setEM(getEM() - 0.1);
		} else {
			setEM(getEM() + 0.05);
		}
	}
	public void deliverShake() {
		luck = 1+r.nextInt(20);
		if (luck == 1) {
			setEM(getEM() - 0.1);
		} else {
			setEM(getEM() + 0.03);
		}
	}
	public void work() {
		takeOrder();
		deliverShake();
	}
}