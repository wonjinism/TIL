//6. 삼각형 안에 작은 역삼각형(투명별 반전)
import java.util.Scanner;
public class DiamondStructure
{
	public static void main(String[] args){
		Scanner inputValue = new Scanner(System.in);
		System.out.print("원하는 별 크기는? (짝수) ");
		int input = inputValue.nextInt();
		int diaSize = input / 2; // 별 숫자가 가장 많은 줄 수
		// 다이아 크기와 상관 없이 변하지 않는 것 정의
		int noneStar = diaSize - 1; // 첫 줄의 좌우 공백 수
		int recordStar = diaSize - noneStar; // 첫 줄 별의 수
		int increaseStar = 2; //두 번째 줄부터 줄 마다 증가하는 별의 수 = 2		

		for (int i = 1; i <= diaSize ; i++){ // 열 
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
		
		noneStar = diaSize -1;
		recordStar = diaSize + noneStar; // 첫 줄의 별의 숫자를 바꾸고 시작.
		noneStar = 0;
		for (int i = 1; i <= diaSize; i++){ // 열 

			for (int j = 1; j <= noneStar; j++ ){ // noneStar만큼 공백 후 별 그려주기
				System.out.print("★");
			}
			for (int k = 1; k <= recordStar; k++){
				System.out.print("☆");
			}
			for (int l = 1; l <= noneStar; l++ ){ // 별 그린 후 noneStar만큼 공백 후 줄바꿈
				System.out.print("★");
			}
			System.out.println();
			noneStar++;
			recordStar -= increaseStar;
		}
	}
}