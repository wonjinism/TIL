package test01;

public class TestMemberVO {
	public static void main(String[] args) {
		MemberVO m1 = new MemberVO("abc", "1234");
		System.out.println(m1.toString());
		MemberVO m2 = new MemberVO();
		m2.setId("abc");
		m2.setPassword("1111");
		System.out.println(m2.toString());
		
		m1.setId("javaking");
		m1.setPassword("wonjinism");
		
		System.out.println(m1.getId());
		System.out.println(m1.getPassword());
	}
}
