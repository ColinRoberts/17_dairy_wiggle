import java.util.Random;
class Simulator {
	private int rndm;
	private Employee e[];
	private Random r;
	public static void main(String args[]) {
		Simulator s = new Simulator();
		
	}
	public Simulator() {
		e = new Employee[6];
		r = new Random();
		for (int g = 0; g < 6; g++) {
			if (g < 2) {
				e[g] = new TastebudStylist();
			} else if (g < 4) {
				e[g] = new Moover();
			} else {
				e[g] = new Shaker();
			}
		}
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < e.length; j++) {
				// @BC: Employees have to work on the weekends, eh? Harsh.  ;)
				for (int x = 0; x < 7; x++) {
					e[j].work();
				}
				e[j].earnPaycheck();
				e[j].setEM(1);
			}
			// @BC: Although this works, a more descriptive method name would be helpful
			print(i);
			// @BC: Since the counter starts at 0, "week 0" starts the simulation and is then marked as a new month after that
			if (i % 4 == 0) {
				System.out.println("New Month");
				rndm = r.nextInt(6);
				e[rndm].earnBonus();
			}
		}
	}
	// @BC: Since this method is not implemented and is never called, it can be removed
	public void dance() {
		
	}
	public void print(int num) {
		System.out.println("Week "+num+" to the simulation:");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
		
	}
}