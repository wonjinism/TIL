package step01;

public class TestHasA1 {
	public static void main(String[] args) {
		Car car1 = new Car("K5", "blue");
		System.out.println(car1.getModel() + " " + car1.getColor()); // K5 blue
		car1.setModel("SM5");
		car1.setColor("black");
		System.out.println(car1.getModel() + " " + car1.getColor()); // SM5 black
		
		Car car2 = new Car("소울", "빨강");
		System.out.println(car2); // car2의 주소 출력
		Person p = new Person("아이유", car2); // Person 안에 Car 객체를 넣었다.
		System.out.println(p.getCarID()); // p에 들어간 Car 객체가 연결된다.
		System.out.println(p.getName()
				+ " " + p.getCarID().getModel()
				+ " " + p.getCarID().getColor()); // 아이유 소울 빨강
	}
}