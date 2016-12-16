package test06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StmtDelete {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 생성 완료.");
			
			String url = "jdbc:mysql://127.0.0.1:3307/java";
			String id = "root";
			String pw = "sds902";
			
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("커넥션 연결 완료.");
			
			String sql = "delete from KHiphop where num = 5";
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			
			System.out.println("SQL전송완료:" + result);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("커넥션 연결오류 SQLException 발생");
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
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
