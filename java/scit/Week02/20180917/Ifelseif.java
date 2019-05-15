import java.util.Scanner;
public class Ifelseif
{
	public static void main(String[] args){
		System.out.println("점수를 입력하세요 : ");
		Scanner inputValue = new Scanner(System.in);
		int score = inputValue.nextInt();

		if ( score >= 90)
		{
			if ( score >= 95)
			{
			System.out.println("A+학점 입니다.");
			} else {
			System.out.println("A-학점 입니다.");
			}
		} else if ( score >= 80 )
		{
			System.out.println("B학점 입니다.");
		} else if ( score >= 70 )
		{
			System.out.println("C학점 입니다.");
		} else
		{
			System.out.println("D학점 입니다.");
		}
	}
}