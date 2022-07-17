package jdbcBook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * 데이터베이스 관리 클래스를 만들고
 * 아래 내용은 관리클래스를 통해서 
 * 접속객체를 얻어오고
 * 그 접속객체를 통해 statement 객체도 생성하고
 * 최종적으로 결과 생성해서
 * 실행하는 프로그램...
 * 클래스는 원하는 형태로.. 정답은 없음.
 * -- 모든로직이 하나의 파일에 들어있는데. 이걸 분리....재사용 가능하게..
 * 
 * @author User
 *
 */
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
		String sql ="SELECT \r\n"
				+ "    c.custid,c.cname,c.address,c.phone,o.orderid,o.bookid,o.saleprice,o.orderdate\r\n"
				+ "FROM\r\n"
				+ "    customers c\r\n"
				+ "        JOIN\r\n"
				+ "    orders o ON c.custid = o.custid\r\n"
				+ "ORDER BY c.custid";	
				
		ResultSet rs =  stmt.executeQuery(sql);
		String result = "<meta charset=\"UTF-8\">";
		while(rs.next()) {
			result += "<p>"+String.format("%d %s %s %s %d %d %d %s"
					,rs.getInt("custid")
					,rs.getString("cname")
					,rs.getString("address")
					,rs.getString("phone")
					,rs.getInt("orderid")
					,rs.getInt("bookid")
					,rs.getInt("saleprice")
					,rs.getDate("orderdate")
					)+ "</p>";			
		}
		System.out.println(result);
		
		// html 파일 생성하기
		File htmlFile = new File("./result.html");
		if(!htmlFile.exists())
			htmlFile.createNewFile();
		// 파일을 열어서 utf-8로 인코딩해서 쓰기
		Writer fw = new BufferedWriter( new OutputStreamWriter(new FileOutputStream(htmlFile),"UTF-8") );				
		fw.write(result);
		fw.close();	//파일 닫기
		
		conn.close(); // db접속 해제
	}

}
