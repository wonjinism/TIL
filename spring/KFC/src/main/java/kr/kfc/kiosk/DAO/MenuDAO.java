package kr.kfc.kiosk.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.kfc.kiosk.VO.Menu;
import kr.kfc.kiosk.util.PageNavigator;

@Repository
public class MenuDAO {
	
	@Autowired
	SqlSession session;
	
	public ArrayList<Menu> selectMenuList(){
		MenuMapper mapper = session.getMapper(MenuMapper.class);
		ArrayList<Menu> menuList = null;
		try {
			menuList = mapper.selectMenuList();
		} catch (Exception e) {
			e.printStackTrace();
			return menuList;
		}
		return menuList;
	}
	
	public ArrayList<Menu> selectMenuList(String search, PageNavigator pn){
		ArrayList<Menu> menuList = null;
		MenuMapper mapper = session.getMapper(MenuMapper.class);
		RowBounds rb = new RowBounds(pn.getStartPageInGroup(), pn.getPostPerPage());
		
		try {
			menuList = mapper.selectMenuList(pn, rb);
		} catch (Exception e) {
			e.printStackTrace();
			return menuList;
		}
		return menuList;
	}

	public Menu selectMenu(int menu_seq){
		MenuMapper mapper = session.getMapper(MenuMapper.class);
		Menu menu = null;
		try {
			menu = mapper.selectMenu(menu_seq);
		} catch (Exception e) {
			e.printStackTrace();
			return menu;
		}
		return menu;
	}
	
	public void updateMenu(Menu menu){
		MenuMapper mapper = session.getMapper(MenuMapper.class);
		int result = 0;
		try {
			result = mapper.updateMenu(menu);
			if(result == 0) {
				System.out.println("DB 업데이트 오류");
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteMenu(int menu_seq){
		MenuMapper mapper = session.getMapper(MenuMapper.class);
		int result = 0;
		try {
			result = mapper.deleteMenu(menu_seq);
			if(result == 0) {
				System.out.println("DB 업데이트 오류");
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int totalCount(int currentPage){
		MenuMapper mapper = session.getMapper(MenuMapper.class);
		int result = 0;
		return result;
	}
}
