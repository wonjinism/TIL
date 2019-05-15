public class Test_181012_03 {
	public static void main(String[] args) {
		// 가변 배열 선언
		int[][] array = new int[4][];
		array[0] = new int[4];
		array[1] = new int[6];
		array[2] = new int[2];
		array[3] = new int[3];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = 0;
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
