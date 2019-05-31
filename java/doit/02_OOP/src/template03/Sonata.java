package template03;

public class Sonata extends Car{

	@Override
	public void start() {
		System.out.println("sonata start");
	}

	@Override
	public void drive() {
		System.out.println("sonata drive");
	}

	@Override
	public void stop() {
		System.out.println("sonata stop");
	}

	@Override
	public void turnoff() {
		System.out.println("sonata turnoff");
	}
	
}
