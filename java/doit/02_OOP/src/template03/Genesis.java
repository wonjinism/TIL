package template03;

public class Genesis extends Car{

	@Override
	public void start() {
		System.out.println("genesis start");
	}

	@Override
	public void drive() {
		System.out.println("genesis drive");
	}

	@Override
	public void stop() {
		System.out.println("genesis stop");
	}

	@Override
	public void turnoff() {
		System.out.println("genesis turnoff");
	}
	
}
