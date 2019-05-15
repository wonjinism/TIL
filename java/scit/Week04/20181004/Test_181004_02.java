/*
원소 10개짜리 char형 배열을 생성하고 알파벳 대문자를 임의로 저장한다. 
이 배열의 내용을 A~F, Q~Z 사이의 문자는 모두 *로 변경한다.

HINT
char형은 문자의 코드값을 정수형으로 저장하는 자료형이다. 'A'의 코드 값보다 1 큰 문자는 'B'이다.
*/
import java.util.Random;
public class Test_181004_02 {
	public static void main(String[] args) {
		Random rnd = new Random();
		char arr[] = new char[10];

		System.out.print("* 변경 전 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char)(65 + rnd.nextInt(26));
			System.out.print(arr[i]);
		}

		System.out.println();
		System.out.print("* 변경 후 : ");
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] >= 'A' && arr[i] <= 'F') || (arr[i] >= 'Q' && arr[i] <= 'Z')) {
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
