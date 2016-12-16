package test03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
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
			Scanner scan = new Scanner(System.in);
			System.out.print("제목: ");
			String title = scan.nextLine();
			System.out.print("출판사: ");
			String publisher = scan.nextLine();
			System.out.print("가격: ");
			int price = scan.nextInt();
			System.out.println("출판년도: ");
			String year = scan.next();
			
			String sql = "insert into books(title,publisher, price,year)" + 
			"values('" + title + "', '" + publisher + "', '" + price + "', '" + year +"')";
			
			// 4. Statement 객체 생성
			stmt = con.createStatement();
			
			// 5. 명령어 실행 -> 5.1 executeUpdate : insert, update, delete 해당
			int result = stmt.executeUpdate(sql);
			
			// 6. 5번의 실행결과값 컨트롤
			System.out.println("SQL 실행 완료 결과 : " + result);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("커넥션 생성 오류:SQLException발생");
			e.printStackTrace();
		} finally {
			// 7. 
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
