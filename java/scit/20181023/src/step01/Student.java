package step01;

public class Student extends Person {

	private String stdId;
	
	public Student() {}
	public Student(String name, String adr, String stdId) {
		super(name, adr);
		this.stdId = stdId;
	}
	
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	
	@Override
	public void printInfo() {
		System.out.println("이름 : " + super.getName() 
		+ " 주소 : " + super.getAdr()
		+ " 학번 : " + getStdId());
	}
}


