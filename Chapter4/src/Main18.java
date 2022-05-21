
public class Main18 {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j += i) {
				System.out.println("LOOP");
			}
		}
	}
}