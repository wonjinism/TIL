package collection;

public class Member implements Comparable<Member> {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId){
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	/*
	 * 추가한 회원 아이디와 매개변수로 받은 회원 아이디를 비교
	 * 두 값을 비교해서 새로 추가한 회원 아이디가 더 크면 양수, 그렇지 않으면 음수, 같으면 0을 반환
	 */
	public int compareTo(Member member) {
		return (this.memberId - member.memberId); 
//		 return (this.memberId - member.memberId) * (-1); // 내림차순으로 정렬하기 위하 반환 값을 음수로 만듦
//		return this.memberName.compareTo(member.memberName);  //String 클래스에 compareTo() 가 정의되어 있으므로 활용
	}
	
	
}
