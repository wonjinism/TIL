public class Test_181001_01 {
	public static void main(String[] args) {
		System.out.println("배열 원소의 값을 증가시키기");
		// 문제 : int형 원소 100개짜리 배열을 생성하고 각 원소의 값을 초기화한 후,
		// 반복문을 이용하여 각 원소의 값을 1씩 증가시킨다.
		// 실행결과 :
		// 초기값 : 9 7 6 4 5 4 0 1 3 2 
		// 변경후 : 10 8 7 5 6 5 1 2 4 3

/*		int[] arr = new int[10];
		arr[0] = 9;
		arr[1] = 7;
		arr[2] = 6;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 4;
		arr[6] = 0;
		arr[7] = 1;
		arr[8] = 3;
		arr[9] = 2;
*/
		int arr[] = {9, 7, 6, 4, 5, 4, 0, 1, 3, 2};
		int i;
		System.out.print("초기값 : ");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i < arr.length - 1 ? " " : "\n"));
		}
		for (i = 0; i < arr.length;i++) {
			arr[i]++;
		} 
		System.out.print("변경후 : ");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i < arr.length - 1 ? " " : "\n"));
		}
	}
}