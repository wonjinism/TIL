public class Test_181012_02 {
	public static void main(String[] args) {
		// 2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램
		int[][] arr2 = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30},
		};
		// 실행결과 : 
		// total = 325
		// average = 16.25
		int total = 0;
		double average = 0;
		int count = 0;
		for (int i = 0; i < arr2.length; i++) { // arr2.length 행의 수
			for (int j = 0; j < arr2[i].length; j++) { // arr2[i].length 한 행의 열의 수
				total += arr2[i][j];
				count++;
			}
		}
		average = (double)total / count;
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}
}