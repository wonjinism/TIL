package step07;

public class TestSingleton { // 한번 생성해서 사용한 객체를 계속 사용할 수 있게 해주는 것
	public static void main(String[] args) {
//		new Company(); // 생성자가 private이라서 생성이 막힘.
		
		Company c = Company.getInstance(); // static에 있는 Company의 intance를 리턴.
		System.out.println(c); 
		
		Company c1 = Company.getInstance();
		System.out.println(c1); // 주소값이 c와 동일함.
		
		System.out.println(c1.getInfo());
		System.out.println(Company.getInstance().getInfo());
	}
}
