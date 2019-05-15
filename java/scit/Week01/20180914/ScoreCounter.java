import java.util.Scanner;
class ScoreCounter 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int scoreKor;
		int scoreEng;
		int scoreMath;
		int scoreTotal;
		int countSub = 0;
		double scoreAvg;
		
		System.out.println("국어점수를 입력하세요.");
		scoreKor = input.nextInt();
		countSub++;
		System.out.println("영어점수를 입력하세요.");
		scoreEng = input.nextInt();
		countSub++;
		System.out.println("수학점수를 입력하세요.");
		scoreMath = input.nextInt();
		countSub++;
		
		scoreTotal = scoreKor + scoreEng + scoreMath;
		scoreAvg = scoreTotal / countSub; // 결과값 : 88.0 // int와 int의 연산 결과는 int
//		scoreAvg = (double)scoreTotal / countSub; // 결과값 : 88.333333 // int와 double의 연산 결과는 double
//		scoreAvg = scoreTotal / (double)countSub; // 결과값 : 88.333333 // int와 double의 연산 결과는 double

		System.out.println("국어점수 : " + scoreKor);
		System.out.println("영어점수 : " + scoreEng);
		System.out.println("수학점수 : " + scoreMath);
		System.out.println("총점 : " + scoreTotal);
		System.out.println("평균 : " + scoreAvg);
	}
}