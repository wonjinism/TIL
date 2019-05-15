package test02;

public class MyDate {
	private int day = 1;
	
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		if (day > 0 && day < 32) {
			this.day = day;
		} else {
			System.out.println("잘못된 입력값입니다.");
		}
	}
}