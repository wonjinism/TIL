import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleTest {
	public static void main(String[] args) {
		Connection conn = null; // DB 연결용 객체
		PreparedStatement pstmt = null; // SQL을 전달하는 객체
		ResultSet rs = null; // SELECT 값을 담을 객체
		try {
			// SQL 문장을 만들어서 실행
			String sql = "SELECT * FROM REGIONS";
			conn = DBConnection.getConnection(); // DB 정보 담아서 연결
			pstmt = conn.prepareStatement(sql); // SQLException
			rs = pstmt.executeQuery(); // sql 결과값을 rs에 리턴
			// REGION_ID	NUMBER = int
			// REGION_NAME	VARCHAR2(25 BYTE) = String
			System.out.println("REGION_ID	REGION_NAME");
			System.out.println("--------------------------------------");
			while(rs.next()) {
				int region_id = rs.getInt(1);
				// int regon_id = rs.getInt("region_id");
				String region_name = rs.getString(2);
				// String regon_name = rs.getString("region_name");
				String result = "	" + region_id + "	" + region_name;
				System.out.println(result);
			}
		} catch (SQLException e) {
			System.out.println("쿼리 실패");
			e.printStackTrace();			
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
}