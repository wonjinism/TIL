/* 
도서번호를 입력하고 저장된 번호를 순서대로 출력
1) 정수형 데이터 10개를 담을 수 있는 배열
2) 사용자에게 정수 타입의 번호를 10번 입력 받음
3) 입력이 완료되면 현재 배열에 저장된 번호를 차례대로 출력
*/
import java.util.Scanner;
public class QuizBookCode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] bookCode = new int[10];
		for (int i = 0; i < bookCode.length; i++) {
			System.out.print("도서번호를 입력하세요 : ");
			bookCode[i] = input.nextInt();
		}
		for(int i = 0; i < bookCode.length; i++) {
			System.out.print(bookCode[i] + " ");
		}
		System.out.println();
	}
}