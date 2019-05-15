package test02;

public class TestMydate {
	public static void main(String[] args) {
		MyDate d = new MyDate();
		d.setDay(32); // 잘못된 입력값입니다.
		System.out.println(d.getDay());
		d.setDay(-1); // 잘못된 입력값입니다.
		System.out.println(d.getDay());
		d.setDay(31);
		System.out.println(d.getDay()); // 31
		
		// month는 1~12만 유효하도록 조건 검사를 똑같이 하게 만든다.
		
		MyMonth m = new MyMonth();
		m.setMonth(13);
		System.out.println(m.getMonth());
		m.setMonth(-1);
		System.out.println(m.getMonth());
		m.setMonth(12);
		System.out.println(m.getMonth());
	}
}