import java.util.Scanner;
class Ifelse
{
	public static void main(String[] args){
		System.out.println("점수를 입력하세요 : ");
		Scanner inputValue = new Scanner(System.in);
		int score = inputValue.nextInt();

		if ( score >= 70)
		{
			System.out.println("합격 입니다.");
		} else {
			System.out.println("불합격 입니다.");
		}
	}
}