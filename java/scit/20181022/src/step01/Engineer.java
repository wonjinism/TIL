package step01;

public class Engineer extends Employee {
	private String skill;

	public Engineer(String empId, String eName, int salary, String skill) {
		super(empId, eName, salary);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String getDetails() {
		return super.getDetails() + " 스킬 : " + skill;
	}
}
