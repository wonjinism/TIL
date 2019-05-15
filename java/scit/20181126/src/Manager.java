import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Manager { 
	public void select1() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from member2";
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql); // SQLException
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println("Your ID : " + rs.getString(1));
				System.out.println("Your Name : " + rs.getString(2));
				System.out.println("Your Password : " + rs.getString(3) + "\n");
			}
		} catch (SQLException e) {
			System.out.println("SQL 쿼리실패");
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
				System.out.println("접속 종료");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public ArrayList<Member> select2(){ // 
		ArrayList<Member> list = new ArrayList<Member>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from member2";
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql); // SQLException
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Member member = new Member();
				member.setId(rs.getString(1));
				member.setName(rs.getString(2));
				member.setPassword(rs.getString(3));
				list.add(member);
			}
			return list;
		} catch (SQLException e) {
			System.out.println("SQL 쿼리 실패");
		} finally {
			close(conn, pstmt, rs);
		}
		return null;
	}
	
	public void insert() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO MEMBER2 VALUES(?, ?, ?)";
			// String sql = "DELETE FROM MEMBER2 WHERE ID=?";
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "aquatea");
			pstmt.setString(2, "aqua");
			pstmt.setString(3, "tea");
			pstmt.executeUpdate(); // SELECT 문을 제외한 INSERT, UPDATE문을 실행
			conn.commit();
			System.out.println("DB 입력 완료!");
		} catch (SQLException e) {
			System.out.println("Insert Failure");
		}finally {
			close(conn, pstmt);
		}
	}
	
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			conn.close();
			System.out.println("접속 종료");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public void close(Connection conn, PreparedStatement pstmt) {
		try {
			pstmt.close();
			conn.close();
			System.out.println("접속 종료");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}