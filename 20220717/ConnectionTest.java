package jdbcBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/test?&serverTimeZome=Asia/Seoul";
		String userid = "root";
		String password = "admin1234";		
		
		// 드라이버를 로딩
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 로드 성공");
		
		System.out.println("데이터베이스 연결 준비......");
		Connection conn = DriverManager.getConnection(url,userid,password);
		System.out.println("접속 성공");
		
		Statement  stmt = conn.createStatement();
		String sql ="select "
				+ "cname "
				+ "from "
				+ "customers";		
				
		ResultSet rs =  stmt.executeQuery(sql);
		while(rs.next()) {
			//rs.getString("cname");  // jdbc에서 데이터가져올때 index는 1부터 시작
			//rs.getString(1);  // jdbc에서 데이터가져올때 index는 1부터 시작
			System.out.println(rs.getString("cname"));
		}
		
		
		
		conn.close();
	}

}
