package step01;

import java.util.HashMap;

public class TestMap1 {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>(); // 타입을 지정해 준다는 것이 Generic을 한다는 것
		map.put("s1", "Wonjin");
		map.put("s2", "Simon");
		map.put("s3", "Sony"); 
//		map.put("s4", 555)); // 타입 지정 때문에 555가 들어갈 수 없음.
		System.out.println(map);
		System.out.println(map.get("아이유")); // null // 존재하지 않는 키 값
		System.out.println(map.get("s1")); // Wonjin // 해당 키 값의 데이터
//		System.out.println(map.get("s3").length());
		System.out.println(((String) map.get("s3")).length()); // 객체 캐스팅을 통해서만 접근 가능
		System.out.println(map.size());
		map.put("s3", "Peter"); // 값만 변경되는 것이 아니라 새 주소를 가지게 된다.
		System.out.println(map);
		System.out.println(map.containsKey("s1"));
		System.out.println(map.containsValue("Simon"));
		System.out.println(map.remove("s1")); // Wonjin // 삭제 key의 value 출력
		System.out.println(map);
		System.out.println(map.remove("s5")); // null // key 없는 경우
		map.clear();
		
		System.out.println(map); // {} 주소와 객체 타입은 그대로
		map.put("em",  new Employee("엔젤", 500));
		Employee e = (Employee)map.get("em");
		System.out.println(e.getEname());
		System.out.println(e.getSalary());

		// 객체 캐스팅으로 멤버 접근
		System.out.println(((Employee)map.get("em")).getEname());
		System.out.println(((Employee)map.get("em")).getSalary());
	}
}