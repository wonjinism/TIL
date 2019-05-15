// 다음 코드의 실행 결과는?
public class Test03 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		boolean res = ++a==1 || ++b==1;
		System.out.println(a + " " + b + " " + res);
	}
}