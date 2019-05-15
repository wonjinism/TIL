public class Test_180928_05 {
	public static void main(String[] args) {
		
		System.out.println("1)");
		// 1 2 3 4 5
		// 2 3 4 5 6
		// 3 4 5 6 7
		// 4 5 6 7 8
		// 5 6 7 8 9 
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= i + 4; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("2)");
		// 0
		// 0 1
		// 0 1 2
		// 0 1 2 3
		// 0 1 2 3 4
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j - 1 + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("3)");
		// 1 2 3 4 5
		// 2 3 4 5
		// 3 4 5
		// 4 5
		// 5
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("4)");
		// 1 0 0 0 0
		// 0 2 0 0 0
		// 0 0 3 0 0
		// 0 0 0 4 0 
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=5 ; j++) {
				if ( j == i ) {
					System.out.print(j + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}