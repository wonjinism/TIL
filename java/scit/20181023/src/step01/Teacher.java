package step01;

public class Teacher extends Person{  // 추상 클래스를 상속 받으면 오류..

	private String subject;
	
	
	public Teacher() {}
	
	public Teacher(String name, String adr, String subject) {
	super(name, adr);
	this.subject = subject;
}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void printInfo() {
		System.out.println("이름 : " + super.getName() 
		+ " 주소 : " + super.getAdr()
		+ " 과목 : " + getSubject());
	}
	
	
}
