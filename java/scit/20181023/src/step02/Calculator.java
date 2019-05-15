package step02;

public class Calculator implements Plus, Times{

	@Override
	public double divide(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public double multiplier(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double minus(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
}
