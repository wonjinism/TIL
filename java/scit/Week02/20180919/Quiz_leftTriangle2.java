//4. 좌측 붙은 삼각형
import java.util.Scanner;
public class Quiz_leftTriangle2
{
	public static void main(String[] args){
		Scanner inputValue = new Scanner(System.in);
		System.out.print("원하는 별탑의 층수는? ");
		int starSize = inputValue.nextInt(); // 최대 별의 갯수
		// 별의 크기와 상관 없이 변하지 않는 것 정의
		int noneStar = starSize - 1; // 최대 별이 들어간 줄 위 아래 공백의 수
		int recordStar = starSize - noneStar; // 첫 줄 별의 수
		int increaseStar = 1; //두 번째 줄부터 줄 마다 증가하는 별의 수		

		for (int i = 1; i <= starSize - 1; i++){ // 열 
			for (int k = 1; k <= recordStar; k++){
				System.out.print("★");
			}
			System.out.println();
			recordStar += increaseStar;
		}

		for (int i = 1; i <= starSize; i++){ // 열 
			for (int k = 1; k <= recordStar; k++){
				System.out.print("★");
			}
			System.out.println();
			recordStar -= increaseStar;
		}
	}
}