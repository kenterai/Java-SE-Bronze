
public class Main14 {
	public static void main(String[] args) {
		Document d = new Document("James");
		d.printOwner();
	}
}

class Document {
	private String owner;

	public Document() {
		this.owner = "none";
	}
	public Document(String owner) {
		this.owner = owner;
	}
	public void printOwner() {
		System.out.println(owner);
	}
}