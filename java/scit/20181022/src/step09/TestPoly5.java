package step09;

public class TestPoly5 {
	public static void main(String[] args) {
		
		Employee en = new Engineer("111", "111", 12, "111");
		System.out.println(en); // Engineer의 toString()을 실행;
		// 부모자식 관계일 때 부모타입으로 메소드를 불러도 자식 쪽에 재정의한 것이 나온다.
		
		
		
//		Employee e = new Employee("K1", "구하연", 200);
//		Manager m = new Manager("K2", "장보영", 300, "영업부");
//		Engineer en = new Engineer("K3", "이대건", 400, "자바");
//		HrMgr mgr = new HrMgr();
//		
//		System.out.println(m instanceof Employee);
//		
//		mgr.printAnnualSalary(e);
//		mgr.printAnnualSalary(m);
//		mgr.printAnnualSalary(en);
	}
}