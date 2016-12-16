package test05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ppstmt = null;
		ResultSet rs = null; //결과집합 자료형
		
		// 1. 드라이버 로딩
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로딩 완료");
			
			String url = "jdbc:mysql://70.12.109.120:3306/java";
			String id = "root";
			String pw = "sds902";
			
			// 2. 커넥션 연결 생성
			con = DriverManager.getConnection(url, id, pw);
			
			System.out.println("커넥션 생성 테스트 완료");
			
			// 3. SQL 명령어 작성
			String sql = "select book_id, title, price from books";
			
			// 4. Statement 객체 생성
			ppstmt = con.prepareStatement(sql);
			
			// 5. 명령어 실행 -> 5.2 executeQuerry : select 해당
			rs = ppstmt.executeQuery(sql);
			
			// 6. 5번의 실행결과값 컨트롤
			while(rs.next()) {
				int bookid = rs.getInt(1);
				String title = rs.getString(2);
				int price = rs.getInt(3);
				
				System.out.println(bookid +"/"+ title +"/"+ price);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("커넥션 생성 오류:SQLException발생");
			e.printStackTrace();
		} finally {
			// 7. 
			if(ppstmt != null) {
				try {
					ppstmt.close();
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
