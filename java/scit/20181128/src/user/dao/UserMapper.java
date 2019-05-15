package user.dao;

import java.util.ArrayList;

import user.vo.User;

public interface UserMapper {
	// 회원 출력
	public ArrayList<User> listUser();
	
	// 회원 정보 테이블 회원 정보
	public int insertUser(User user); // insert 성공한 줄 수 만큼 int 값을 반환

	// 회원 주소 테이블 회원 정보
	public int insertAddress(User user);
	
	// 회원 주소 정보 삭제
	public int deleteUser(String string);
}
