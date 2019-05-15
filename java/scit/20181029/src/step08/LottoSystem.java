package step08;

import java.util.Random;
import java.util.TreeSet;

public class LottoSystem {
	
	
	public TreeSet makeLotto() {
		TreeSet tree = new TreeSet();
		Random r = new Random();
		while (tree.size() < 6) {
			tree.add(r.nextInt(45) + 1); // 0 ~ 44까지의 숫자를 랜덤으로 뽑아냄.			
		}
		return tree;
	}

}
