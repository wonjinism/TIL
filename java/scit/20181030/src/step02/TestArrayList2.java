package step02;

import java.util.ArrayList;

public class TestArrayList2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new MemberVO("id01", "pw01", "아이유", "종로"));
		System.out.println(list);
		list.add(new MemberVO("id02", "pw02", "신세경", "마포"));
		System.out.println(list);
		System.out.println(list.get(0));
//		System.out.println(list.get(0).getName());
		// ArrayList.get(@)에 저장된 객체를 가져올 수 있지만, 해당 객체의 멤버에는 접근 불가.
		System.out.println(((MemberVO)list.get(0)).getName());
		// ArrayList의 부모가 Object이기 때문에 MemberVO의 getName에 접근할 수 없으므로 객체캐스팅 해줘야 함.

		// 따라서 Object > 객체 생성해서 연결 > 멤버 접근
		Object obj = list.get(0);
		MemberVO mvo = (MemberVO)obj;
		System.out.println(mvo.getName()); // 아이유
		
		MemberVO mvo1 = (MemberVO)list.get(1);
		System.out.println(mvo1.getName()); // 신세경
		mvo1.setName("김희철");// 김희철로 바뀌어 버림.
		// Object > 객체 생성해서 연결하더라도 새 주소를 얻는 것이 아니라 
		// 연결만 한 것이기 때문에 값을 바꾸면 ArrayList에 연결된 값도 함께 변경됨.
		
		System.out.println(list);
		System.out.println("================================");
		list.add(new MemberVO("id03", "pw03", "강호동", "구미"));
		for (int i = 0; i < list.size(); i++) {
			MemberVO vo = (MemberVO)list.get(i);
			System.out.println(vo.getName());			
		}
		System.out.println("================================");
		list.add(new MemberVO("id04", "pw04", "주원진", "부평"));
		list.add(new MemberVO("id05", "pw05", "김지훈", "부평"));
		// 부평에 사는 모든 사람의 이름을 출력
		for (int i = 0; i < list.size(); i++) {
			MemberVO vo = (MemberVO)list.get(i);
			if (vo.getAddress().equals("부평")) {
				System.out.println(vo.getName());
			}
		}
		System.out.println("================================");
		MemberVO id05 = (MemberVO)list.get(4);
		System.out.println(id05); // id05를 연결
		
		System.out.println(list);
		MemberVO mem = new MemberVO("javaking", "qwerty", "Wonjin", "Busan");
		list.set(4, mem); // id05 자리에 mem 객체의 주소로 연결해 줌.
		System.out.println(list); // list에는 mem 주소로 연결된 객체값이 출력되며,
		System.out.println(id05); // id05는 그대로 남아 조회됨. 
		list.remove(list.get(4)); // remove(@object); // 오브젝트의 value로 삭제
		System.out.println(list);
		list.remove(3); // remove(@index); // 인덱스로 삭제
		System.out.println(list);
	}
}