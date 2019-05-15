package test05;

public class TestMemberVO {
	public static void main(String[] args) {
		MemberVO vo1 = new MemberVO();
		System.out.println(vo1.getId() + " " + vo1.getMoney()); // null 0
		MemberVO vo2 = new MemberVO("javastar");
		System.out.println(vo2.getId() + " " + vo2.getMoney()); // javastar 0
		MemberVO vo3 = new MemberVO("javaking", 10000);
		System.out.println(vo3.getId() + " " + vo3.getMoney()); // javaking 0
	}
}