package kr.kfc.kiosk.DAO;

import java.util.HashMap;

public interface AdminMapper {
	public HashMap<String, String> getAdmin(HashMap<String, String> login);
}
