package step05;

import java.util.ArrayList;
import java.util.Iterator;

import step03.Employee;

public class TestIterator2 {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("Wonjin", 220));
		list.add(new Employee("Sonya", 320));
		list.add(new Employee("Simon", 400));
		// 월급이 300 이상인 사람의 이름을 출력

		
		for (int i = 0; i < list.size(); i++) {
			if (((Employee)list.get(i)).getSalary() >= 300) {
				System.out.println(((Employee)list.get(i)).getEname());
			}
		}
		
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			Employee temp = it.next();
			if(temp.getSalary() >= 300) {
				System.out.println(temp.getEname());
			}
		}
	}
}
