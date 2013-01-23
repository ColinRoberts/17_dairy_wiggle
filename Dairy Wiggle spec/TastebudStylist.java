import java.util.Random;
class TastebudStylist extends Employee {
	private int luck;
	public TastebudStylist() {
		super(250, 200);
		Random r = new Random();
		luck = 1+r.nextInt(10);
	}
	public void makeShake() {
		if (luck == 1) {
			setEM(1);
		} else {
			setEM(getEM() + 0.1);
		}
	}
	public void work() {
		makeShake();
	}
}