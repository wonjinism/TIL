class PrefixAndPostfix 
{
	public static void main(String[] args) 
	{
		int total = 100;
		System.out.println(total);
		total = total - --total;
		System.out.println(total);
		
		total = 100;
		System.out.println(total);
		total = total - total--;
		System.out.println(total);
	}
}
