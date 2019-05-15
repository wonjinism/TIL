class LogicalOp 
{
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println((i != 0) && (100/i > 10));
		System.out.println((i == 10) || (100/i > 10));
		System.out.println((i < 0) ^ (i == 10));
		System.out.println(!(i > 1));

		System.out.println();

		System.out.println( i != 0  &&  100/i > 10 );
		System.out.println( i == 10 || 100/i > 10 );
		System.out.println( i < 0  ^  i == 10 );
		System.out.println(!(i > 1));
	}
}
