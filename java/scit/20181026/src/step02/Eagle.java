package step02;

public class Eagle extends Bird implements Fighter {

	@Override
	public void fight() {
		System.out.println("독수리가 싸우다");
	}
	
}
