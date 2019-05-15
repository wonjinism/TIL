package step01;

public class TestArray {
	/*
	 * 기본형 데이터를 담는 배열연습
	 */
	public static void main(String[] args) {
		// 1. 배열 선언
		int ages[];
		// 2. 배열 생성
		ages = new int[3];
		System.out.println(ages); // 배열 주소값
		System.out.println(ages[2]); // 0 (int의 기본 초기값)
		//3. 배열 요소 값 할당
		ages[0] = 20;
		ages[1] = 35;
		ages[2] = 28;
		System.out.println(ages[2]); // 28
		System.out.println(ages.length); // 배열의 길이 3
//		System.out.println(ages[3]); // 배열의 길이를 벗어난 숫자를 넣어서 실행할 수 없다.
		for (int i = 0; i < ages.length; i++) { // 배열의 전체 출력
			System.out.println(ages[i]);
		}
	}
}
