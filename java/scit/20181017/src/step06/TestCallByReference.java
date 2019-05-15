package step06;

import step01.Car;

public class TestCallByReference {
	public static void main(String[] args) {
		DataMgr mgr = new DataMgr();
		Car car1 = new Car("K5", "WHITE");
		mgr.passTestRef(car1);
		System.out.println(car1.getModel());
		
		mgr.passTestValue(car1); // 객체에서 객체를 당긴 값을 set으로 바꾸는 것.
		System.out.println(car1.getModel());
	}
}