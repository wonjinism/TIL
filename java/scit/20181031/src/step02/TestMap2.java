package step02;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import step01.Employee;

public class TestMap2 { 
	public static void main(String[] args) {
		HashMap<Integer, Integer> testMap = new HashMap();
		testMap.put(1, 100);
		testMap.put(2, 100);
		testMap.put(3, 100);
		testMap.put(4, 100);
		System.out.println(testMap);
		testMap.put(1, 200);
		System.out.println(testMap);
		System.out.println(testMap.get(1));
		
		HashMap<String, Employee> map = new HashMap<>();
		Employee e1 = new Employee("최명주", 250);
		map.put("e1", e1);
		Employee e2 = new Employee("박소연", 550);
		map.put("e2", e2);
		Employee e3 = new Employee("장보영", 310);
		map.put("e3", e3);
		Employee e4 = new Employee("최명주", 250);
		map.put("e4", e4);
		System.out.println(map);
		// 월급이 300을 초과하는 사람의 이름을 출력
		// values() > Collection > Iterator
		Collection<Employee> col = map.values();
		System.out.println(col);
		Iterator<Employee> it = col.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			if (e.getSalary() > 300) {
				System.out.println(e.getEname());
			}
		}
		System.out.println("============================");
		// map의 key만 출력
		Set<String> set = map.keySet();
		System.out.println("Set<String> set" + set);
		Iterator<String> it2 = set.iterator();
		while (it2.hasNext()) {
			String key = it2.next();
			System.out.println("key값 : " + key);
			System.out.println("value값 : " + map.get(key)); 
//			System.out.println("value값 : " + map.get(it2.next())); // next() 메서드는 호출하면 다음줄로 이동
			System.out.println("value값의 salary" + ((Employee) map.get(key)).getSalary());
		}
		
		// map에 들어 있는 value값이 Employee의 이름을 중복제거하고 전체 출력
		// values() > Collection > Iterator()
		Collection col3 = map.values();
		System.out.println("Collection" + col3);
		Iterator it3 = col3.iterator();
		HashSet<String> hSet = new HashSet<String>();
		while (it3.hasNext()) {
			Employee e = (Employee) it3.next();
			hSet.add(e.getEname());
		}
		System.out.println(hSet);
	}
}