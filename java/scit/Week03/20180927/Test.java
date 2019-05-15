class Test {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println(a + b + c + "4");
		System.out.println("4" + a + b + c);
		System.out.println(a + b + c + "4" + c + b + a);

// 주간 시험 마지막 문제
		a = 10;
		b = 3;
		double d = 3.3;

		System.out.println(a / b);
		System.out.println(a / b * d);
		System.out.println((double)a % d);
		System.out.println(a / b * d + (double)a % d);
	}
}
