package test;

public class DidNotDecideStill {

	private int t;
	private String n;

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public static void main(String[] args) {
		DidNotDecideStill d = new DidNotDecideStill(7, "vamsi");
		System.out.println(d.getN());
	}

	public DidNotDecideStill(int t, String n) {
		super();
		this.t = t;
		this.n = n;
	}

}
