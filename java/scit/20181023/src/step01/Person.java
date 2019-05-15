package step01;

public abstract class Person {
	private String name;
	private String adr;
	
	public Person(String name, String adr) {
		super();
		this.name = name;
		this.adr = adr;
	}
	public Person() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public abstract void printInfo(); // 추상 메소드를 가지고 있으면 추상 클래스
	
}
