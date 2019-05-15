package step07;

public class Company {
	private String info = "회사정보";
	// 클래스 로딩시에 초기화 되는 static을 이용해 단 한번만 생성
	private static Company company = new Company(); // 객체에 자기 자신을 담는다
	private Company() {} 	// 외부에서 객체 생서을 못하도록 막는다.

	public static Company getInstance() { 	// 외부에서 사용할수 있는 static 메서드를 공유한다.
		return company;
	}	
	public String getInfo() {
		return info;
	}
}
