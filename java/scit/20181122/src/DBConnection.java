import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection { // DAO
	public static Connection getConnection(){
		Connection conn = null; // 오라클 DB 연결용 객체
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // SQLDeveloper 실행해서 속성의 SID
			String user = "hr";
			String password = "oracle";
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ClassNotFoundException
			conn = DriverManager.getConnection(url, user, password); // SQLException

			System.out.println("접속 OK");
			
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}catch(SQLException se) {
			System.out.println("접속 실패");
		}
		return conn;
	} 
}