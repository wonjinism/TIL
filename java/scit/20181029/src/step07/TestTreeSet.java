package step07;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		// TreeSet : 정렬 개념이 추가된 Set(int...)

//		TreeSet tree = new TreeSet();
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(5);
		tree.add(3);
		tree.add(4);
		tree.add(1);
		tree.add(2);
		System.out.println(tree);
		System.out.println(tree.descendingSet());
	}
}
