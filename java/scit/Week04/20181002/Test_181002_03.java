import java.util.Scanner;
public class Test_181002_03 {
	public static void main(String[] args) {
		System.out.println("수강생의 수를 입력받고 각 수강생의 자바 성적을 입력받아 총합과 평균을 출력");
		Scanner input = new Scanner(System.in);
		int students;
		int java;
		int studentScore[];
		int scoreTotal = 0;
		double scoreAvg;

		System.out.print("수강생의 수 : ");
		students = input.nextInt();
		studentScore = new int[students];
		for (int i = 0; i < students; i++ ) {
			System.out.print(i + 1 + "번째 학생 Java성적 : ");
			studentScore[i] = input.nextInt();
			scoreTotal += studentScore[i];
		}
		System.out.println();
		scoreAvg = (double)scoreTotal / students;
		System.out.println("Java성적 총합 : " + scoreTotal);
		System.out.println("Java성적 평균 : " + scoreAvg);
	}
}