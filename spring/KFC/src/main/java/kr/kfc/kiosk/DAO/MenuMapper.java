package kr.kfc.kiosk.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;

import kr.kfc.kiosk.VO.Menu;
import kr.kfc.kiosk.util.PageNavigator;

public interface MenuMapper {
	public int insertMenu(Menu menu);
	public int updateMenu(Menu menu);
	public int deleteMenu(int menu_seq);
	public ArrayList<Menu> selectMenuList();
	public ArrayList<Menu> selectMenuList(PageNavigator pn, RowBounds bn);
	public Menu selectMenu(int menu_seq);
	public int totalCount(String search);
}
