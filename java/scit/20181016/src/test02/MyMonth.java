package test02;

public class MyMonth {
	private int month = 1;

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		if (month > 0 && month < 13) {
			this.month = month;
		} else {
			System.out.println("잘못된 입력값입니다.");
		}
	}
}
