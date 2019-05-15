package step02;

import java.util.StringTokenizer;

public class TestStringTokenizer {
	public static void main(String[] args) {
		String str = "보영, 대건, 회인, 진영, 승준, 나희, 선기, 성민, 경규, 훈영";
		StringTokenizer stk = new StringTokenizer(str, ", ");
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
	}
}
