import java.util.Scanner;
public class StarStructure
{
	public static void main(String[] args){
		Scanner inputValue = new Scanner(System.in);
		System.out.print("원하는 별탑의 층수는? ");
		int starSize = inputValue.nextInt(); // 줄 수와 동일
		// 별의 크기와 상관 없이 변하지 않는 것 정의
		int noneStar = starSize - 1; // 첫 줄의 좌우 공백 수
		int recordStar = starSize - noneStar; // 첫 줄 별의 수
		int increaseStar = 2; //두 번째 줄부터 줄 마다 증가하는 별의 수 = 2		

		for (int i = 1; i <= starSize; i++){ // 열 
			for (int j = 1; j <= noneStar; j++ ){ // noneStar만큼 공백 후 별 그려주기
				System.out.print("　");
			}
			for (int k = 1; k <= recordStar; k++){
				System.out.print("★");
			}
			for (int l = 1; l <= noneStar; l++ ){ // 별 그린 후 noneStar만큼 공백 후 줄바꿈
				System.out.print("　");
			}
			System.out.println();
			noneStar--;
			recordStar += increaseStar;
		}
		
		System.out.println();
		noneStar = starSize -1;
		recordStar = starSize + noneStar; // 첫 줄의 별의 숫자를 바꾸고 시작.
		noneStar = 0;
		for (int i = 1; i <= starSize; i++){ // 열 
			for (int j = 1; j <= noneStar; j++ ){ // noneStar만큼 공백 후 별 그려주기
				System.out.print("　");
			}
			for (int k = 1; k <= recordStar; k++){
				System.out.print("☆");
			}
			for (int l = 1; l <= noneStar; l++ ){ // 별 그린 후 noneStar만큼 공백 후 줄바꿈
				System.out.print("　");
			}
			System.out.println();
			noneStar++;
			recordStar -= increaseStar;
		}
	}
}