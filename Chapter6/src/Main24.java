
public class Main24 {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		String str = a.doMethod();
		System.out.println(str);
	}
}

class ClassA {
	static String doMethod() {
		return "hoge";
	}
}