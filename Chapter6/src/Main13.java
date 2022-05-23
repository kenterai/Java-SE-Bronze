
public class Main13 {
	public static void main(String[] args) {
		Station s = new Station();
		s.setName("Santa Clara");
		s.printName();
	}
}

class Station {
	private String name;
	
	public Station(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void printName() {
		System.out.println(name);
	}
}