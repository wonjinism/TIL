package array;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(array1, 0, array2, 1, 4);
		// array1의 0번째부터 복사할건데, array2의 1번째부터 붙여넣을 거고, array1의 0번째부터 4개를 복사해서 넣을 거임 ㅇㅁㅇ
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
}
