package step06;

import java.util.HashSet;

public class WordMgr {
	public void printWordKing(String memo) {
		String str[] = memo.split(" ");
		HashSet set = new HashSet();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		System.out.println(set);
	}
}
