public class Test_180928_04 {
	public static void main(String[] args) {
		System.out.println("수열 출력하기");
		// 문제 : 실행결과와 같은 5행의 수열을 출력하는 2중 for문 만들기
		// 0 1 2 3 4 
		// 0 1 2 3 4 
		// 0 1 2 3 4 
		// 0 1 2 3 4 
		// 0 1 2 3 4 
		//
		// 0 0 0 0 0
		// 1 1 1 1 1
		// 2 2 2 2 2
		// 3 3 3 3 3
		// 4 4 4 4 4

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
