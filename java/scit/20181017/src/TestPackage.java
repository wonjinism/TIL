import step03.bank.Kbank;

public class TestPackage {
	public static void main(String[] args) {
		Kbank kb1 = new Kbank();
		kb1.test();
		
		Kbank kb2 = new Kbank("COEX");
		System.out.println(kb2.getBranch());
		kb2.setBranch("Samsung-eki");
		System.out.println(kb2.getBranch());
	}
}