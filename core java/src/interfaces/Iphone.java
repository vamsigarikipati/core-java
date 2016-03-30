package interfaces;

public class Iphone implements HomeButton {
	private String name;

	public Iphone(String name) {
		this.name = name;
	}

	public void button() {
		System.out.println(name + "'s home button is pressed");

	}

}
