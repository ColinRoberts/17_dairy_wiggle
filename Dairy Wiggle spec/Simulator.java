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
				for (int x = 0; x < 7; x++) {
					e[j].work();
				}
				e[j].earnPaycheck();
				e[j].setEM(1);
			}
			print(i);
			if (i % 4 == 0) {
				System.out.println("New Month");
				rndm = r.nextInt(6);
				e[rndm].earnBonus();
			}
		}
	}
	public void dance() {
		
	}
	public void print(int num) {
		System.out.println("Week "+num+" to the simulation:");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
		
	}
}