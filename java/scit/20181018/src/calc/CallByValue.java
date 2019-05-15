package calc;

public class CallByValue {
	public int x;
	public int y;
	
	public static void swap(int a, int b) {
		System.out.println("(매서드 작업 전)복사된 매개변수 a의  값 :" + a + "복사된 매개변수 b의 값 :" + b);
		int temp = a;
		a = b;
		b = temp;		
		System.out.println("(매서드 작업 후)복사된 매개변수 a의  값 :" + a + "복사된 매개변수 b의 값 :" + b);
	}

	public static void main(String[] args) {

		int a1 = 10;
		int b1 = 20;
		System.out.println("a1 : " + a1 + " b1 : " + b1); //swap 매서드 호출 전
		swap(a1,b1);									  //swap 호출               -> 매개변수의 값이 매서드로 복사되어 연산됨.
		System.out.println("a1 : " + a1 + " b1 : " + b1); //swap 매서드 호출 후 -> 복사된 매개변수의 값은 다른 주소를 가지므로 원래 매개변수의 값이 변하는 것이 아님
	}
}