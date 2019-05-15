package step06;

import step01.Car;

public class DataMgr {
	public void passTestRef(Car car2) {
		car2 = new Car("SM5", "BLACK");
		System.out.println();
	}
	public void passTestValue(Car car3) {
		car3.setModel("QM5");
	}
}
