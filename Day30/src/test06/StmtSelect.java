package test06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StmtSelect {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로딩 완료");
			
			String url = "jdbc:mysql://70.12.109.120:3306/java";
			String id = "root";
			String pw = "sds902";
			
			con = DriverManager.getConnection(url, id, pw);
			
			String sql = "select * from KHiphop";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				int num = rs.getInt(1);
				String title = rs.getString(2);
				String singer = rs.getString(3);
				int listenerpop = rs.getInt(4);
				String company = rs.getString(5);
				
				System.out.println(num +"/" + title +"/" + singer +"/" + listenerpop +"/" + company);
			}
			System.out.println("조회 완료.");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("커넥션 연결 오류 SQLExeption 발생");
			e.printStackTrace();
		} finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
