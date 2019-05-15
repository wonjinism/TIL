/* 
도서번호를 입력하고 저장된 번호를 순서대로 출력
1) 정수형 데이터 10개를 담을 수 있는 배열
2) 사용자에게 정수 타입의 번호를 10번 입력 받음
3) 입력이 완료되면 현재 배열에 저장된 번호를 차례대로 출력
*/

/* 
추가 1) 배열의 숫자를 사용자에게 받음
추가 2) 오름차순 배열
*/
import java.util.Scanner;
public class QuizBookCode2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("입력할 도서의 수량을 입력하세요 : ");
		int a = input.nextInt();
		int[] bookCode = new int[a];
		for (int i = 0; i < bookCode.length; i++) {
			System.out.print("도서번호를 입력하세요 : ");
			bookCode[i] = input.nextInt();
		}
		
		int temp = 0;
		for(int i = 0; i < bookCode.length; i++) {
			for (int j = i + 1; j < bookCode.length; j++) {
				if ( bookCode[i] > bookCode[j]) {
					temp = bookCode[i];
					bookCode[i] = bookCode[j];
					bookCode[j] = temp;
				}
			}
		}
		for(int i = 0; i < bookCode.length; i++) {
			System.out.print(bookCode[i] + " ");
		}
		System.out.println();
	}
}