package DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import VO.Board;
import VO.Member;

public class MemberDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

	public int insertMember(Member member) {
		SqlSession session = factory.openSession();
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int result = 0;
		try {
			result = mapper.insertMember(member);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			session.close();
		}
		return result;
	}

	public Member loginMember(Member member) {
		SqlSession session = factory.openSession();
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		Member resultMember;
		try {
			resultMember = mapper.loginMember(member);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
		return resultMember;
	}

	public void insertBoard(Board board) {
		SqlSession session = factory.openSession();
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		try {
			mapper.insertBoard(board);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public ArrayList<Board> selectBoard() {
		ArrayList<Board> list;
		SqlSession session = factory.openSession();
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		try {
			list = mapper.selectBoard();
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}
	
	public int deleteBoard(Board board) {
		return 0;
	}
}
