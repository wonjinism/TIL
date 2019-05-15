/* 
 * 입력 받은 문자열을 대문자로 변환하여 출력
 * 영문 소문자를 대문자로 변환
 * 영무 소문자 이외의 문자는 그대로 출력
 * String 클래스의 toUpperCase 메서드 사용 금지
 * 1a#Eb 입력 시 1A#EB 출력
 */

import java.util.Scanner;

public class UpperClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.nextLine();
		char[] charArr = input.toCharArray();
		
		for (int i = 0; i < charArr.length; i++) {
			int check = (int)charArr[i];
			System.out.println(charArr[i] + " : " + check);
			if(check >= 97 && check <= 122) {
				check -= 32;
				charArr[i] = (char)check;
			}
		}
		String result = new String(charArr);
		System.out.println(result);
	}
}