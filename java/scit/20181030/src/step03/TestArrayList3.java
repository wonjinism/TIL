package step03;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestArrayList3 {
	public static void main(String[] args) {
		CompanyMgr mgr = new CompanyMgr();
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("Wonjin", 220));
		list.add(new Employee("Sonya", 320));
		list.add(new Employee("Simon", 400));
		double avg = mgr.avgSalary(list);
		System.out.println(avg); // 전체 Employee의 평균 월급이 출력
		// list의 모든 Employee의 월급이 10% 인상된 rlist를 만드세요.
		ArrayList<Employee> rlist = mgr.addBonusList(list);
		System.out.println(rlist);
		System.out.println(list);
		
		// LinkedList : 연속된 데이터가 끝점과 시작점이 연결되는 형태의 리스트
		// ArrayList도 순서 변경이나 삽입이 가능하기는 하지만, 
		// index 중심이기 때문에 for문을 돌리는 도중에 변경과 삽입을 하면 오류가 난다.
		LinkedList<Employee> lkList = new LinkedList<>();
		lkList.add(new Employee("아이유", 220));
		lkList.add(new Employee("윤계상", 320));
		lkList.add(new Employee("안내상", 400));
		System.out.println(lkList);
		
		lkList.add(1, new Employee("김지훈", 250));
		System.out.println(lkList);
	}
}
