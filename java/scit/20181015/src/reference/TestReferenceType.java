package reference;

public class TestReferenceType {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Peter");
		System.out.println(p1.getName());
		
		Person p2 = new Person();
		p2.setName("Simon");
		System.out.println(p2.getName());
		
		p2 = p1; // p1의 주소 값을 가지게 됨.
		System.out.println(p2.getName()); 
		
		p2 = null; // p2는 p1의 주소값을 잃어버림.
		System.out.println(p1.getName()); // p1은 변함 없음.
//		System.out.println(p2.getName());  
		Person p3 = new Person();
		System.out.println(p3.getName());
	}
}
