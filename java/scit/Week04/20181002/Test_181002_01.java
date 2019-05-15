public class Test_181002_01 {
	public static void main(String[] args) {
		System.out.println("배열 문제 1");
		// int형 배열을 10개 생성해서 각 원소의 값을 2배+1로 만든 후 출력하세요.
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i] + (i < arr.length - 1 ? " " : "\n"));
		}
		for (int i = 0; i < arr.length; i++ ) {
			arr[i] = arr[i] * 2 + 1;
			System.out.print(arr[i] + (i < arr.length - 1 ? " " : "\n"));
		}
	}
}