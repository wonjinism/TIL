package step05;

public class TestThrow1 {
	public static void main(String[] args) {
		Person p = new Person();
		try { // throws가 걸린 메소드를 사용하려고 하면 반드시 try를 걸어줘야 한다. 
			p.setMoney(-1);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(p.money);
		System.out.println("그 이하 처리내용은 정상 처리");
	}
}
