package step01;

import java.util.ArrayList;

public class TestArrayList1 {
	public static void main(String[] args) {
		// List : 순서를 보장하고, 중복을 허용하는 배열과 동일한 성향
//		ArrayList<Object>
		ArrayList list = new ArrayList();
		list.add("Wonjin");
		list.add("Simon");
		list.add("Sonya");
		list.add(4);
		System.out.println(list); // toString() 오버라이딩
		System.out.println(list.size()); // 길이 4
		list.add("Wonjin");
		System.out.println(list);
		System.out.println(list.contains("Wonjin")); // 존재여부 true/false
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println("--------");
			System.out.println(list.get(i));
		}
		
		System.out.println(list); // [Wonjin, Simon, Sonya, 4, Wonjin]
		list.remove("Wonjin"); // 가장 빠른 순서의 값을 삭제
		System.out.println(list); // [Simon, Sonya, 4, Wonjin]
		list.remove("Wonjin"); // 다음 값을 삭제
		System.out.println(list); // [Simon, Sonya, 4]		
		list.clear();
		System.out.println(list); // [] // 데이터가 삭제된 상황
		list = null;
		System.out.println(list); // null // かたち　객체의 형태만 제거된 상황.
	}
}