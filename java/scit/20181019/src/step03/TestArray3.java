package step03;

public class TestArray3 {
	
	public static void main(String[] args) {
		// 1. 배열 선언 (객체를 기본형태로 가지는 배열)
		Car cars[]; // 기본 초기값을 null로 가진다.
		// 2. 배열 생성
		cars = new Car[3];
		System.out.println(cars[0]); // 기본 초기값 null;
		// String str; 기본 초기값을 null로 가진다.
		// 3. 할당
		cars[0] = new Car("K5", 2000);
		cars[1] = new Car("K7", 3000);
		cars[2] = new Car("K3", 1000);
		System.out.println(cars[0]);
		// 마지막 배열 요소의 가격을 출력
		System.out.println(cars[2].getPrice()); // 1000
		System.out.println(cars[cars.length - 1].getPrice()); // 위와 동일한 동작
		// 배열 안에 들어 있는 자동차 객체의 모델명을 모두 출력
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i].getModel());
		}
		// 배열 요소의 자동차 가격 평균
		int total = 0;
		for (int i = 0; i < cars.length; i++) {
			total += cars[0].getPrice();
		}
		System.out.println(total / cars.length);
				
		Car[] parkingSpace = {
				new Car("소울", 2000),
				new Car("BMW", 4500),
				new Car("캠리", 3100),
				new Car("아반테", 1800),
		};
		// 차 가격이 3000 이상인 자동차의 모델명만 출력
		for (int i = 0; i < parkingSpace.length; i++) {
			if(parkingSpace[i].getPrice() >= 3000) {
				System.out.println(parkingSpace[i].getModel());
			}
		}
	}
}