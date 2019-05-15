package step08;

import java.util.TreeSet;

public class TestLottoSet {
	public static void main(String[] args) {
		// 1~45까지 임의의 수 6개를 반환
		LottoSystem lotto = new LottoSystem();
		TreeSet set = lotto.makeLotto();
		System.out.println(set);		
	}
}