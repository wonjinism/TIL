class TypeCasting 
{
	public static void main(String[] args) 
	{
		int i = 10;
		short s = 155;
		char c = 'A';
		double d;
		byte b;

		d = i;
		b = (byte)s;


		System.out.println("i = " + i);
		System.out.println("s = " + s);
		System.out.println("c = " + (int)c);
		System.out.println("d = " + d);
		System.out.println("b = " + b);
	}
}
