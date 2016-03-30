package interfaces;

public class SamsungPhone implements HomeButton {
	private String name;

	public SamsungPhone(String name) {
		this.name = name;
	}

	public void button() {
		System.out.println(name + "'s home button is pressed.");

	}
}