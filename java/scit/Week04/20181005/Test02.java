// 다음 코드의 실행 결과는?
public class Test02 {
	public static void main(String[] args) {
		int i = 5, j = 0;
		out :
			for (; ; ) {
				i--;
				for (; ; ) {
					if ( i < ++j ) break out;
				}
			}
		System.out.println("i = " + i + ", j = " + j);
	}
}
