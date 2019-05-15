package step05;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
//		HashSet set = new HashSet();
		Set<String> set = new HashSet<String>();
		set.add("아이유");
		set.add("김구라");
		set.add("김회인");
		set.add("김회인"); // 중복을 허용하지 않는다.
		System.out.println(set); // toString() 오버라이딩 되어서 요소가 전체 출력
		System.out.println(set.toString()); // 위와 동일
		System.out.println(set.size()); // 3
		System.out.println(set.contains("김구라")); // 요소가 존재하는지 true/false
		System.out.println(set.remove("김구라")); // 해당 요소를 삭제할 수 있었는지 true/false
		System.out.println(set);
		set.clear(); // 삭제
		System.out.println(set);
		set = null; // 주소값 링크도 삭제
		System.out.println(set);
	}
}