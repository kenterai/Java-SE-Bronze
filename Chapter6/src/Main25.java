
public class Main25 {
	public static void main(String[] args) {
		int n = ClassA.getNumber();
		System.out.println(n);
	}
}

class ClassA {
	private int number = 0;

	public static int getNumber() {
		return number;
	}
}