package template03;

public class Avante extends Car{

	@Override
	public void start() {
		System.out.println("avante start");
	}

	@Override
	public void drive() {
		System.out.println("avante drive");
	}

	@Override
	public void stop() {
		System.out.println("avante stop");
	}

	@Override
	public void turnoff() {
		System.out.println("avante turnoff");
	}
	
}
