class NumberLineUp {
	public static void main(String[] args) 
	{
		for (int i = 1; i < 100; i++) {
			if (i <= 9) {
				System.out.print(" ");
			}
			System.out.print(i + " ");
			if ( i % 4 == 0 ) {
				System.out.println();
			}
		}
		System.out.println();
	}
}