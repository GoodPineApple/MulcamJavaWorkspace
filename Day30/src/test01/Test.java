package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) {
		Connection con = null;
		// 1. 드라이버 로딩
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로딩 완료");
			
			
			
			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String id = "root";
			String pw = "sds902";
			
			// 2. 커넥션 연결 생성
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("커넥션 생성 테스트 완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("커넥션 생성 오류:SQLException발생");
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
