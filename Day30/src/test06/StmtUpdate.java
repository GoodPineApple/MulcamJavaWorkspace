package test06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StmtUpdate {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로딩 완료.");
			
			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String id = "root";
			String pw = "sds902";
			
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("컨넥션 생성 완료.");
			
			Scanner scan = new Scanner(System.in);
//			System.out.println("곡제목 :");
//			String t = scan.nextLine();
//			System.out.println("가수 :");
//			String s = scan.nextLine();
			System.out.println("재생수 :");
			int l = scan.nextInt();
//			System.out.println("소속사 :");
//			String c = scan.next();
			
			String sql = "update KHiphop set listenerpop = " + l + " where num = 5";
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("SQL실행완료결과: " + result );
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("컨넥션 생성 오류 SQLException 발생");
			e.printStackTrace();
		} finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
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
