package template03;

public class Grandeur extends Car{

	@Override
	public void start() {
		System.out.println("grandeur start");
	}

	@Override
	public void drive() {
		System.out.println("grandeur drive");
	}

	@Override
	public void stop() {
		System.out.println("grandeur stop");
	}

	@Override
	public void turnoff() {
		System.out.println("grandeur turnoff");
	}

}
