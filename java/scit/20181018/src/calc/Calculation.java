package calc;

public class Calculation {
	private int a;
	private int b;
	
	public Calculation(){
		
	}
	
	public Calculation(int a, int b){
		this.a = a;
		this.b = b;		
	}

	
			
	public int sum(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public int mul(int x, int y) {
		return x * y;
	}
	
	public double div(int x, int y) {
		return (double)x / y;
	}

	
	public int sum2(Calculation z) {
		return z.a + z.b;
	}

	public int sub2(Calculation z) {
		return z.a - z.b;
	}

	public int mul2(Calculation z) {
		return z.a * z.b;
	}
	
	public double div2(Calculation z) {
		return (double)z.a / z.b;
	}

}
