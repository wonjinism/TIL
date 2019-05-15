class Ternary
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b;

		b = a < 9 ? 3 : 5; 
		/* 참 거짓으로 판단되는 수식이 들어가야 함.
		 a < b ? x : y
		 x = 참일 때 출력 되는 값
		 y = 거짓일 때 출력 되는 값
		*/
		System.out.println("결과는 " + b);
	}
}