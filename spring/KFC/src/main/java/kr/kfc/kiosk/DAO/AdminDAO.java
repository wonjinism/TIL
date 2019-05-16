package kr.kfc.kiosk.DAO;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDAO {
	
	@Autowired
	SqlSession session;
	
	public HashMap<String, String> getAdmin(HashMap<String, String> login){
		AdminMapper mapper = session.getMapper(AdminMapper.class);
		HashMap<String, String> admin = null;
		try {
			admin = mapper.getAdmin(login);
			System.out.println("출력" + admin.get("PASSWORD")); ////
		} catch (Exception e) {
			e.printStackTrace();
			return admin;
		}
		return admin;
	}
	
}
