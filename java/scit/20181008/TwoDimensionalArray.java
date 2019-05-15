public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] arrayTwoD = {{0,1,2,3},{4,5,6,7},{8,9,10,11}};
		for (int i = 0; i < arrayTwoD.length; i++) {
			System.out.print(arrayTwoD[i][0]);
		}
		System.out.println();
		for (int i = 0; i < arrayTwoD.length; i++) {
			System.out.print(arrayTwoD[0][i]);
		}
	}
}