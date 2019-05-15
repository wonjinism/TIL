package step04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {
		/* 
		 * Iterator : Collection 계열의 요소를 읽기 위한 방법으로 표준화된 인터페이스
		 * 주요 abstract method
		 * hasNext() : boolean -> 다음 읽어올 요소가 있으면 true 없으면 false를 반환
		 * next() : Object
		 */
		List<String> list = new ArrayList();
		list.add("Wonjin");
		list.add("Simon");
		list.add("Sonya");
		System.out.println(list); 
		System.out.println();
		
		// Iterator 인터페이스를  이용해서 모든 요소를 출력
		System.out.println(list.iterator()); // 주소값이 출력됨.
		Iterator it = list.iterator();
		System.out.println("================");
		System.out.println("Iterator를 사용한 요소 출력");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		// List의 경우에는 iterator 사용하지 않고 .get(@index)로 출력 가능
		System.out.println("================");
		System.out.println("list.get(@index)사용한 요소 출력");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		

		System.out.println("=====================");
		System.out.println("HashSet");
		System.out.println("=====================");
		HashSet set = new HashSet();
		set.add("김나희2");
		set.add("김지훈1");
		set.add("김원진3");
		System.out.println(set);
		Iterator it2 = set.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}	
		
		System.out.println();
		
		HashSet numSet = new HashSet();
		numSet.add(3);
		numSet.add(4);
		numSet.add(1);
		numSet.add(5);
		numSet.add(2);
		System.out.println(numSet);
		Iterator it3 = numSet.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}	
	}
}