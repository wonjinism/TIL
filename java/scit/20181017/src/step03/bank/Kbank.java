package step03.bank;

public class Kbank {
	private String branch;
	public Kbank(){}
	public Kbank(String branch) {
		this.branch = branch;
	}
	public void test() {
		System.out.println("test...");
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getBranch() {
		return branch;
	}
}
