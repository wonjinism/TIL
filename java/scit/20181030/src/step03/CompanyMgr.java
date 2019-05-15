package step03;

import java.util.ArrayList;

public class CompanyMgr {
	public double avgSalary(ArrayList<Employee> list) { // Employee 타입을 지정해 두었기 때문에 캐스팅 하지 않아도 된다.
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).getSalary();
		}
		return (double)sum / list.size();
	}

	// list 안의 객체 주소가 복사되기 때문에 값이 함께 바뀌게 되어서 
	// 기존 값을 그대로 두고 새 리스트를 만들 수 없는 코드
	public ArrayList<Employee> addBonusList(ArrayList<Employee> list) {
		ArrayList<Employee> tlist = new ArrayList<Employee>();
		for (int j = 0; j < list.size(); j++) {
			Employee temp = list.get(j);
			temp.setSalary((int) (temp.getSalary() * 1.1));
			tlist.add(temp);
		}
		return tlist;
	}

//	public ArrayList<Employee> addBonusList(ArrayList<Employee> list) {
//		for (int j = 0; j < list.size(); j++) {
//			list.get(j).setSalary((int) (list.get(j).getSalary() * 1.1));
//		}
//		return list;
//	}
	
}
