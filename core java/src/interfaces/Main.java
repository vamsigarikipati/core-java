package interfaces;

public class Main {

	public static void main(String[] args) {

		HomeButton samsung = new SamsungPhone("samsung phone");
		samsung.button();

		HomeButton iphone = new Iphone("Iphone");
		iphone.button();
	}

}
